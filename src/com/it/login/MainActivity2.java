package com.it.login;


import com.it.userlogin.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2  extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
		TextView textView=(TextView) findViewById(R.id.show_tv);
		  textView.setText("Î¢ÈíITÑ§Ôº»¶Ó­Äú");
	}
	
        
}
