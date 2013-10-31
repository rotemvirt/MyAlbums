package com.example.myalbums;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AlbumEditer extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_album_editer);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.album_editer, menu);
		return true;
	}

}
