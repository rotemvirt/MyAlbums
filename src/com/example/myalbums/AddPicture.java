package com.example.myalbums;

import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class AddPicture extends Activity {

	final int RESULT_LOAD_IMAGE = 100;

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

	public void uploadFromGallery(View view) {
		Intent photoPickerIntent = new Intent();
		photoPickerIntent.setType("image/*");
		photoPickerIntent.setAction(Intent.ACTION_GET_CONTENT);
		startActivityForResult(photoPickerIntent, 100);
	}

	public void CemraApp(View view) {
		Intent myIntent = new Intent();
		myIntent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
		startActivityForResult(myIntent, RESULT_LOAD_IMAGE);

	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);

		if (requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK
				&& null != data) {

			Uri selectedImage = data.getData();
			String[] filePathColumn = { MediaStore.Images.Media.DATA };
			Cursor cursor = getContentResolver().query(selectedImage,
					filePathColumn, null, null, null);
			cursor.moveToFirst();
			int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
			String picturePath = cursor.getString(columnIndex);
			cursor.close();
		}
	}
}