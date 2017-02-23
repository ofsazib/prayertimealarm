package com.example.prayertimealarm;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class DeveloperActivity extends Activity {
	Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_developer);
		btn = (Button) findViewById(R.id.develop);
	}

	public void cancel(View view) {
		finish();
	}

}
