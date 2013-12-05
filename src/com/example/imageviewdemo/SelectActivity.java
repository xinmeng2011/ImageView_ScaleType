package com.example.imageviewdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView.ScaleType;

public class SelectActivity extends Activity {

	int mPicId;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		Intent intent = getIntent();
		mPicId = intent.getIntExtra("PIC_ID",-1);
		requestWindowFeature(Window.FEATURE_LEFT_ICON); 
		setContentView(R.layout.show_choices);
		
		Button bt = (Button)findViewById(R.id.bt_Center);
		bt.setOnClickListener(mClick);
		
		bt = (Button)findViewById(R.id.bt_CenterCrop);
		bt.setOnClickListener(mClick);
		
		bt = (Button)findViewById(R.id.bt_CenterInside);
		bt.setOnClickListener(mClick);
		
		bt = (Button)findViewById(R.id.bt_fitCenter);
		bt.setOnClickListener(mClick);
		
		bt = (Button)findViewById(R.id.bt_fitEnd);
		bt.setOnClickListener(mClick);
		
		bt = (Button)findViewById(R.id.bt_fitStart);
		bt.setOnClickListener(mClick);
		
		bt = (Button)findViewById(R.id.bt_fitXY);
		bt.setOnClickListener(mClick);
		
		bt = (Button)findViewById(R.id.bt_matrix);
		bt.setOnClickListener(mClick);
		getWindow().setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, mPicId); 
	}

	
	private View.OnClickListener mClick = new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			String type= "";
			switch (v.getId()) {
			case R.id.bt_matrix:
				type = ScaleType.MATRIX.name();
				break;
			case R.id.bt_fitXY:
				type = ScaleType.FIT_XY.name();
				break;
			case R.id.bt_fitStart:
				type = ScaleType.FIT_START.name();
				break;
			case R.id.bt_fitEnd:
				type = ScaleType.FIT_END.name();
				break;
			case R.id.bt_fitCenter:
				type = ScaleType.FIT_CENTER.name();
				break;
			case R.id.bt_CenterInside:
				type = ScaleType.CENTER_INSIDE.name();
				break;
			case R.id.bt_CenterCrop:
				type = ScaleType.CENTER_CROP.name();
				break;
			case R.id.bt_Center:
				type = ScaleType.CENTER.name();
				break;
			default:
				break;
				
			}
			
			//传值打开 显示页面
			
			Intent it = new Intent();
			it.putExtra("PIC_ID", mPicId);
			it.putExtra("TYPE_STR", type);
			it.setClass(SelectActivity.this, ShowActivity.class);
			startActivity(it);
		}
	};
	
}
