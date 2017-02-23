package com.example.prayertimealarm;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class LaunchingActivity extends Activity {
	public final String TAG = this.getClass().getSimpleName();
	Button astop, lstop;
	TextView textView;
	public static int oldid;
	public static String name;
	MediaPlayer mediaPlayer = new MediaPlayer();
	private WakeLock mWakeLock;
	private static final int WAKELOCK_TIMEOUT = 60 * 1000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_launching);
		mediaPlayer = MediaPlayer.create(this, R.raw.ajan);
		displaymessage();
		astop = (Button) findViewById(R.id.lstop);
		lstop = (Button) findViewById(R.id.lok);
		textView = (TextView) findViewById(R.id.ltext);
		textView.setText(name);
		mediaPlayer.start();

		Runnable releaseWakelock = new Runnable() {

			@Override
			public void run() {
				getWindow().clearFlags(
						WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON);
				getWindow().clearFlags(
						WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
				getWindow().clearFlags(
						WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);
				getWindow().clearFlags(
						WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD);

				if (mWakeLock != null && mWakeLock.isHeld()) {
					mWakeLock.release();
				}
			}
		};

		new Handler().postDelayed(releaseWakelock, WAKELOCK_TIMEOUT);

	}

	@SuppressWarnings("deprecation")
	@Override
	protected void onResume() {
		super.onResume();

		// Set the window to keep screen on
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD);

		// Acquire wakelock
		PowerManager pm = (PowerManager) getApplicationContext()
				.getSystemService(Context.POWER_SERVICE);
		if (mWakeLock == null) {
			mWakeLock = pm
					.newWakeLock(
							(PowerManager.FULL_WAKE_LOCK
									| PowerManager.SCREEN_BRIGHT_WAKE_LOCK | PowerManager.ACQUIRE_CAUSES_WAKEUP),
							TAG);
		}
	}

	@Override
	protected void onPause() {
		super.onPause();

		if (mWakeLock != null && mWakeLock.isHeld()) {
			mWakeLock.release();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.launching, menu);
		return true;
	}

	public void remove(View view) {
		finish();
	}

	public void stopalarm(View view) {
		mediaPlayer.stop();
		// finish();
	}

	public static void displaymessage() {

		oldid = AlarmReceiver.Oid;
		if (oldid == 2) {
			name = "Prayer Time Start....\n\n \nYou Should Complete Your Prayer in Proper Time";
		} else if (oldid == 3) {
			name = "Prayer Time Start....\n \n\nYou Should Complete Your Prayer in Proper Time";
		} else if (oldid == 4) {
			name = "Prayer Time Start....\n\n\n You Should Complete Your Prayer in Proper Time";
		} else if (oldid == 5) {
			name = "Prayer Time Start....\n \n\nYou Should Complete Your Prayer in Proper Time";
		} else if (oldid == 1) {
			name = "Prayer Time Start....\n\n\n You Should Complete Your Prayer in Proper Time";
		}
	}

}
