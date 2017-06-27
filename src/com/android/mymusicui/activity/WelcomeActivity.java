package com.android.mymusicui.activity;

import com.android.mymusicui.R;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class WelcomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		
		new Handler().postDelayed(new Runnable() {  

            @Override  
            public void run() {  
                Intent intent = new Intent(WelcomeActivity.this,  
                		MainActivity.class);  
                startActivity(intent);  
                finish();
            }  
  
        }, 3000);  
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
