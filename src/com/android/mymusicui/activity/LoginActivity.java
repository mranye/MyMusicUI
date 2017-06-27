package com.android.mymusicui.activity;

import com.android.mymusicui.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends Activity {

	private EditText etName,etPwd;
	private Button btnLogin;
	private TextView tvForgetPwd,tvLogin;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		initViews();
		initListeners();
	}

	private void initViews() {
		etName = (EditText) findViewById(R.id.login_et_name);
		etPwd = (EditText) findViewById(R.id.login_et_pwd);
		btnLogin = (Button) findViewById(R.id.login_btn_login);
		tvForgetPwd = (TextView) findViewById(R.id.login_tv_forget);
		
	}

	private void initListeners() {
		btnLogin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String name = etName.getText().toString();
				String pwd = etPwd.getText().toString();
				
				SharedPreferences sp = getSharedPreferences("user.xml", Context.MODE_PRIVATE);
				String spName = sp.getString("name", "nothing");
				String spPwd = sp.getString("pwd", "nothing");
				if(spName.equals("nothing")||spPwd.equals("nothing")){
					Toast.makeText(LoginActivity.this, "«Îœ»◊¢≤·", 0).show();
					return;
				}
				if(name.equals(etName)&&pwd.equals(spPwd)){
					//startActivity(new Intent(LoginActivity.this,MainActivity.class));
					Intent intent = new Intent();
					intent.putExtra("name", name);
					setResult(200,intent);
					finish();
				}else{
					Toast.makeText(LoginActivity.this, "’À∫≈√‹¬Î¥ÌŒÛ", 0).show();
				}
						
			}
		});
		tvForgetPwd.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(LoginActivity.this,ForgetPwdActivity.class));
			}
		});
		
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		
		if(requestCode==100&&resultCode==200){
			String name=data.getStringExtra("name");
			tvLogin.setText(name);
		}
		
	}


}
