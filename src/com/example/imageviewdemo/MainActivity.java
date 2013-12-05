package com.example.imageviewdemo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
        
        ImageView b1 = (ImageView)findViewById(R.id.image1);
        b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent it = new Intent();
				it.putExtra("PIC_ID", R.drawable.a1);
				it.setClass(MainActivity.this, SelectActivity.class);
				startActivity(it);
			}
		});
        
        ImageView b2 = (ImageView)findViewById(R.id.image2);
        b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent it = new Intent();
				it.putExtra("PIC_ID", R.drawable.a2);
				it.setClass(MainActivity.this, SelectActivity.class);
				startActivity(it);
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
