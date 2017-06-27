package com.android.mymusicui.activity;

import com.android.mymusicui.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LoginOrRegistActivity extends Activity {

	private Button btnstartlogin,btnstartregist;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_loginorregist);
		initViews();
		initListeners();
	}

	

	private void initViews() {
		btnstartlogin = (Button) findViewById(R.id.start_btn_login);
		btnstartregist = (Button) findViewById(R.id.start_btn_regist);
		
	}

	private void initListeners() {
		btnstartlogin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intentLogin = new Intent(LoginOrRegistActivity.this,LoginActivity.class);
				startActivity(intentLogin);
			}
		});
		
		btnstartregist.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intentRegist = new Intent(LoginOrRegistActivity.this,RegistActivity.class);
				startActivity(intentRegist);
			}
		});
		
	}


}
