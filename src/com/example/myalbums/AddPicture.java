package com.example.myalbums;

import android.os.Bundle;
import android.provider.MediaStore;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class AddPicture extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_picture);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_picture, menu);
		return true;
	}
	
	public void uploadFromGallery(View view){
		Intent photoPickerIntent = new Intent();
		photoPickerIntent.setType("image/*");
		photoPickerIntent.setAction(Intent.ACTION_GET_CONTENT);
		startActivityForResult(photoPickerIntent, 100);
	}
	
	public void CemraApp(View view){
		Intent myIntent = new Intent();
		myIntent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
		startActivityForResult(myIntent,100);
	}
}
