package edu.gatech.seclass;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TransactionHistory extends Activity {
 private ListView lv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_transaction_history);

        lv = (ListView) findViewById(R.id.listView1);

        List<String> trans_list = new ArrayList<String>();
        trans_list.add("01/14/2015 :09:16 - $45");
        trans_list.add("01/28/2015 :15:02 - $48"); 
        trans_list.add("02/02/2015 :08:45 - $64");
        trans_list.add("02/10/2015 :12:34 - $100");
        trans_list.add("03/12/2015 :16:45 - $76");
        trans_list.add("03/24/2015 :06:24 - $120");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,android.R.layout.simple_list_item_1,trans_list );

        lv.setAdapter(arrayAdapter); 
	}
	 


}
