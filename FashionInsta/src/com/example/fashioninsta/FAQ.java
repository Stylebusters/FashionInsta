package com.example.fashioninsta;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class FAQ extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_faq);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.homefaq, menu);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item){
		Intent i;
		switch (item.getItemId())
		{
		case R.id.action_home:
			i = new Intent(getApplicationContext(), HomePage.class);
			startActivity(i);
			return true;
			
		case R.id.action_faq:
			Toast.makeText(FAQ.this, "This is FAQ", Toast.LENGTH_SHORT).show();
			return true;
		
		default:
			return super.onOptionsItemSelected(item);
		}
		
	}

}
