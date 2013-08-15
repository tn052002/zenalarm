package com.example.alarmquotes;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener {

	
	Button display;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        display = (Button) findViewById(R.id.button2);
        display.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View view) {
		// TODO Auto-generated method stub
		
		Intent menu;

		switch (view.getId()) {
		case R.id.button2:
			
			//create instance of ServerCall class
			// on that instance call the method which handles the server url call and get the response.
			// while invoking the next activity(i.e DisplayQuote.Activity) pass some parameters. These parameters will be the values which u need to set in the UI of the DisplayQuote.actity!!
			
			 menu = new Intent(MainActivity.this,
					DisplayQuote.class);
			startActivity(menu);
			break;

					
		}
		
		
	}
				

    
}
