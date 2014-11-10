package com.mindtherobot.samples.thermometer;

import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;

public class AdvProgressBarActivity extends Activity {
	
	private AdvProgressBar advprogressbar;
	private int index = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_adv_progress_bar);
		advprogressbar = (AdvProgressBar)findViewById(R.id.advprogressbar);
		mTimer.start();
	}
	
	private final CountDownTimer mTimer = new CountDownTimer(30000, 100) {

		@Override
		public void onTick(final long millisUntilFinished) {
			if(index >= 101){
				index = 0;
			}
			advprogressbar.setValue(index);
			index++;
		}

		@Override
		public void onFinish() {}
	};
}
