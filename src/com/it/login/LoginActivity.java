  package com.it.login;

import com.it.userlogin.R;

import android.R.id;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
	public void fun(View view){
		
		
		
		EditText nameET = (EditText) findViewById(R.id.name_et);
		EditText passET = (EditText) findViewById(R.id.pass_et);
		
		String name=nameET.getText().toString();
		String pass=passET.getText().toString();
		
		if(name.equals("micro") && pass.equals("it")){
			
			Toast.makeText(this,"»¶Ó­µÇÂ¼", Toast.LENGTH_LONG).show();
			  Intent intent=new Intent(this,MainActivity2.class);
			  startActivity(intent);
		
		}else
			Toast.makeText(this,"µÇÂ¼Ê§°Ü", Toast.LENGTH_LONG).show();
		
	}		
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
