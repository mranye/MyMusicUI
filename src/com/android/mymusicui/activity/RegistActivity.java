package com.android.mymusicui.activity;


import com.android.mymusicui.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class RegistActivity extends Activity {

	private EditText etName,etPwd,etPwdAgain;
	private Button btnRegist;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_regist);
		initViews();
		initListeners();
	}

	private void initViews() {
		etName = (EditText) findViewById(R.id.regist_et_name);
		etPwd = (EditText) findViewById(R.id.regist_et_pwd);
		//etPwdAgain = (EditText) findViewById(R.id.regist_et_pwd_again);
		btnRegist = (Button) findViewById(R.id.regist_btn_regist);
		
		
	}

	private void initListeners() {
		btnRegist.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				SharedPreferences sp = getSharedPreferences("user.xml", Context.MODE_PRIVATE);
				Editor editor = sp.edit();
				String name = etName.getText().toString();
				String pwd = etPwd.getText().toString();
				//String pwdAgain = etPwdAgain.getText().toString();
				
				if("".equals(name)){
					etName.setError("«Î ‰»Î’À∫≈");
					return;
				}
				if("".equals(pwd)){
					etPwd.setError("«Î ‰»Î√‹¬Î");
					return;
				}
				/*if("".equals(pwdAgain)){
					etPwdAgain.setError("«Î ‰»Î»∑»œ√‹¬Î");
					return;
				}*/
				/*if(!pwd.equals(pwdAgain)){
					etPwdAgain.setError("»∑»œ√‹¬Î¥ÌŒÛ£¨«Î÷ÿ–¬ ‰»Î");
					etPwdAgain.setText("");
					return;
				}*/
				editor.putString("name", name);
				editor.putString("pwd", name);
				editor.commit();
				finish();
				Intent intent = new Intent(RegistActivity.this,RegistNextActivity.class);
				startActivity(intent);
						
			}
		});
		
	}


}
