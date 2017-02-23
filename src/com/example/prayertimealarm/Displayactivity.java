package com.example.prayertimealarm;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Displayactivity extends Activity {
	String name;
	TextView date, dname, fazar, zuhor, asar, magrib, easha, sunrise;
	Button button, sb, cb;
	SorageFile storeFile = new SorageFile();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_displayactivity);
		name = getIntent().getStringExtra("nam");
		dname = (TextView) findViewById(R.id.distname);
		date = (TextView) findViewById(R.id.date);
		fazar = (TextView) findViewById(R.id.fazar);
		zuhor = (TextView) findViewById(R.id.zuhor);
		asar = (TextView) findViewById(R.id.Asar);
		magrib = (TextView) findViewById(R.id.magrib);
		easha = (TextView) findViewById(R.id.easha);
		sunrise = (TextView) findViewById(R.id.sunrise);
		button = (Button) findViewById(R.id.start);
		sb = (Button) findViewById(R.id.alarmstart);
		cb = (Button) findViewById(R.id.alarmstop);
		dname.setText(name);
		// /SorageFile.getDistrictname(name);
		date.setText(storeFile.setdates());
		fazar.setText(SorageFile.fazarString);
		zuhor.setText(SorageFile.zuhorString);
		asar.setText(SorageFile.asarString);
		magrib.setText(SorageFile.magribString);
		easha.setText(SorageFile.eashaString);
		sunrise.setText(SorageFile.sunString);
	}

	public void cancel(View view) {
		finish();
	}

	public void alarmstop(View view) {
		AlarmReceiver.cancelAlarm(this);
	}

	public void alarmstart(View view) {
		//AlarmReceiver.startAlarm(this);
		Intent intent=new Intent(this,SelectActivity.class);
		startActivity(intent);
	}

}
