package edu.gatech.seclass;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);		
	}


	public void viewStallManager(View v){
		Intent intent = new Intent(getApplicationContext(),Customer.class);
		startActivity(intent);
	}
	public void viewCustomer(View v){
		Intent intent = new Intent(getApplicationContext(),Customer.class);
		startActivity(intent);
	}
	
	public void viewPurchase(View v){
		Intent intent = new Intent(getApplicationContext(),CustomerTransaction.class);
		startActivity(intent);
	}
	
	public void viewHistory(View v){
		Intent intent = new Intent(getApplicationContext(),TransactionHistory.class);
		startActivity(intent);
	}
	

	
	
	
}
