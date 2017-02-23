package com.example.prayertimealarm;

import java.util.Calendar;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

@SuppressLint("NewApi")
public class AlarmReceiver extends BroadcastReceiver {
	public static final int Nid = 10;
	public static int Min, Id = 0, Hs, Oid = 0, DT;

	@Override
	public void onReceive(Context context, Intent intent) {

		cancelAlarm(context);
		startAlarm(context);
	}

	public static void startAlarm(Context context) {
		cancelAlarm(context);
		Hs = getHour();
		Min = getMinute();
		Id = getid();
		Oid = Id;
		DT = getDate();
		if(Hs>0)
		   {
			startingAlarm(context);
			}
	}

	public static void startingAlarm(Context context) {

		Intent intent = new Intent(context, AlarmService.class);
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());
		calendar.set(Calendar.HOUR_OF_DAY, Hs);
		calendar.set(Calendar.MINUTE, Min);
		calendar.set(Calendar.SECOND, 00);
		calendar.set(Calendar.DAY_OF_WEEK, DT);
		PendingIntent pendingIntent = PendingIntent.getService(context, Id,
				intent, PendingIntent.FLAG_UPDATE_CURRENT);
		AlarmManager alarmManager = (AlarmManager) context
				.getSystemService(Context.ALARM_SERVICE);
		alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),
				pendingIntent);
		notificationdisplay(context);
	}

	public static void cancelAlarm(Context context) {
		cancelnotificationdisplay(context);
		if (Oid == Id) {

			Intent intent = new Intent(context, AlarmService.class);
			PendingIntent pendingIntent = PendingIntent.getService(context, Id,
					intent, PendingIntent.FLAG_UPDATE_CURRENT);
			AlarmManager alarmManager = (AlarmManager) context
					.getSystemService(Context.ALARM_SERVICE);
			if (alarmManager != null) {
				alarmManager.cancel(pendingIntent);
			}

		}
	}

	public static void notificationdisplay(Context context) {

		NotificationManager nmg = (NotificationManager) context
				.getSystemService(context.NOTIFICATION_SERVICE);
		if (nmg != null) {
			nmg.cancel(Nid);
		}
		Notification note = new Notification(R.drawable.notif,
				"Alarm Notification!", System.currentTimeMillis());
		PendingIntent iPendingIntent = PendingIntent.getService(context, 0,
				new Intent(context, AlarmNotification.class), 0);
		note.setLatestEventInfo(context, "AlarmSchedule",
				"Next Alarm starts at  " + Hs + ": " + Min, iPendingIntent);
		nmg.notify(Nid, note);

	}

	public static void cancelnotificationdisplay(Context context) {

		NotificationManager nmg = (NotificationManager) context
				.getSystemService(context.NOTIFICATION_SERVICE);
		if (nmg != null) {
			nmg.cancel(Nid);
		}
	}

	public static int getHour() {
		SorageFile.getHourMinute();
		int h = SorageFile.H;
		return h;
	}

	public static int getMinute() {
		SorageFile.getHourMinute();
		int m = SorageFile.M;
		return m;
	}

	public static int getid() {
		SorageFile.getHourMinute();
		int id = SorageFile.ID;
		return id;

	}

	public static int getDate() {
		SorageFile.getHourMinute();
		int d = SorageFile.D;
		return d;
	}

}
