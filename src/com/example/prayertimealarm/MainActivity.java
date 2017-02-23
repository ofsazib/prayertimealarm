package com.example.prayertimealarm;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

public class MainActivity extends Activity implements TextWatcher {
	String name;
	Button button;
	Spinner spinner;
	AutoCompleteTextView actv;
	ArrayAdapter<String> adapter, spadapter;
	String[] district = { "Dhaka", "Sylhet", "Moulvibazar", "Bogra", "Barisal",
			"Bhola", "Jhalokati", "Patuakhali", "Pirojpur", "Bandarban",
			"Brahmanbaria", "Chandpur", "Chittagong", "Comilla", "Cox's Bazar",
			"Feni", "Khagrachhari", "Lakshmipur", "Noakhali", "Rangamati",
			"Faridpur", "Gazipur", "Gopalganj", "Jamalpur", "Kishoreganj",
			"Madaripur", "Manikganj", "Munshiganj", "Mymensingh",
			"Narayanganj", "Narsingdi", "Netrakona", "Rajbari", "Shariatpur",
			"Sherpur", "Tangail", "Bagerhat", "Chuadanga", "Jessore",
			"Jhenaidah", "Khulna", "Kushtia", "Magura", "Meherpur", "Narail",
			"Satkhira", "Bogra", "Joypurhat", "Naogaon", "Natore",
			"ChanpaiNawabganj", "Pabna", "Rajshahi", "Sirajganj", "Dinajpur",
			"Gaibandha", "Kurigram", "Lalmonirhat", "Nilphamari", "Panchagarh",
			"Rangpur", "Thakurgaon", "Habiganj", "Sunamganj" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		spinner = (Spinner) findViewById(R.id.distlist);
		actv = (AutoCompleteTextView) findViewById(R.id.searchdistlist);
		button = (Button) findViewById(R.id.ok);
		adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, district);
		actv.setAdapter(adapter);
		spadapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, district);
		spinner.setAdapter(spadapter);
		actv.addTextChangedListener(this);
		spinner.setOnItemSelectedListener(listener);
	}

	OnItemSelectedListener listener = new OnItemSelectedListener() {

		@Override
		public void onItemSelected(AdapterView<?> parent, View v, int position,
				long id) {
			name = district[position];
			SorageFile.getDistrictname(name);
		}

		@Override
		public void onNothingSelected(AdapterView<?> arg0) {

		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case R.id.action_settings: {
			Intent intent = new Intent(this, DeveloperActivity.class);
			startActivity(intent);
			return true;
		}
		}
		return false;
	}

	@Override
	public void beforeTextChanged(CharSequence s, int start, int count,
			int after) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTextChanged(CharSequence s, int start, int before, int count) {
		// TODO Auto-generated method stub
		name = actv.getText().toString();
		for (int i = 0; i < district.length; i++) {
			if (district[i].equals(name)) {
				spinner.setSelection(i);
				actv.setHint("District name");
			}

		}
		SorageFile.getDistrictname(name);
	}

	@Override
	public void afterTextChanged(Editable s) {
		// TODO Auto-generated method stub
		actv.setHint("Search your District");
	}

	public void Submit(View view) {

		Intent intent = new Intent(this, Displayactivity.class);
		intent.putExtra("nam", name);
		startActivity(intent);

	}

	public void dismis(View view) {
		finish();
	}

}
