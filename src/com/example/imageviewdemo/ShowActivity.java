package com.example.imageviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class ShowActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		
		ImageView image = (ImageView) findViewById(R.id.pic);
		
		int resId = getIntent().getIntExtra("PIC_ID", -1);
		String type = getIntent().getStringExtra("TYPE_STR");
		image.setImageResource(R.drawable.a1);
		
		image.setScaleType(ScaleType.valueOf(type));
		
        image = (ImageView) findViewById(R.id.pic2);
		

		image.setImageResource(R.drawable.a2);
		
		image.setScaleType(ScaleType.valueOf(type));
		
	}

}
