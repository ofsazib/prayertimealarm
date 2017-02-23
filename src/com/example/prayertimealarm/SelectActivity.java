package com.example.prayertimealarm;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class SelectActivity extends Activity {

	CheckBox f,z,a,m,e;
public Boolean F,Z,A,M,E;
	Button bt;
	public static int  co=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_select);
		F=Z=A=M=E=false;
		co=0;
		f=(CheckBox)findViewById(R.id.checkBox1);
		z=(CheckBox)findViewById(R.id.checkBox2);
		a=(CheckBox)findViewById(R.id.checkBox3);
		m=(CheckBox)findViewById(R.id.checkBox4);
		e=(CheckBox)findViewById(R.id.checkBox5);
		bt=(Button)findViewById(R.id.button1);
	   f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
		
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			if (isChecked) {
				F=true;
				co++;
			}else {
				F=false;
			}
			
		}
	});
	   z.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		 if (isChecked) {
			Z=true;
			co++;
		}else {
			Z=false;
		}
			
		}
	});
	   a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		if (isChecked) {
			A=true;
			co++;
		}else {
			A=false;
		}
			
		}
	});
	   m.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			if (isChecked) {
				M=true;
				co++;
			}else {
				M=false;
			}
			
		}
	});
	   e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			if (isChecked) {
				E=true;
				co++;
			}else {
				E=false;
			}
			
		}
	});
		
	}
	
	
public void selectalarm(View view){
SorageFile.setvalues(F,Z,A,M,E);
if (co>0) {
	AlarmReceiver.startAlarm(this);
}else {
	AlarmReceiver.cancelAlarm(this);
}

finish();
}


}
