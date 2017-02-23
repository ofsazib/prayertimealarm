package com.example.prayertimealarm;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AlarmService extends Service {

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {

		Intent alarmIntent = new Intent(getBaseContext(),
				LaunchingActivity.class);
		alarmIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		alarmIntent.putExtras(intent);
		AlarmReceiver.startAlarm(this);
		getApplication().startActivity(alarmIntent);
		return super.onStartCommand(intent, flags, startId);
	}

}
