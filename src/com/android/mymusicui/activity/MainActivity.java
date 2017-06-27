package com.android.mymusicui.activity;

import com.android.mymusicui.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button btnlogin;
	private Button btnmessage;
	private Button btlistview;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initView();
		initListener();
	}

	private void initView() {
		btnlogin = (Button) findViewById(R.id.test_login);
		btnmessage = (Button) findViewById(R.id.test_mymessage);
		btlistview = (Button) findViewById(R.id.test_listview);

	}

	private void initListener() {
		btnlogin.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intentlogin = new Intent(MainActivity.this,
						LoginOrRegistActivity.class);
				startActivity(intentlogin);
			}
		});
		btnmessage.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intentlogin = new Intent(MainActivity.this,
						MyMessageActivity.class);
				startActivity(intentlogin);
			}
		});
		btlistview.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intentlogin = new Intent(MainActivity.this,
						RecommendActivity.class);
				startActivity(intentlogin);
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
