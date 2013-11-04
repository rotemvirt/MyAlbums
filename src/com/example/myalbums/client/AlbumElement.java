package com.example.myalbums.client;

import android.graphics.Bitmap;
import android.net.Uri;


/**
 * 
 * @author Rotem Virt
 * gmail: rotemvirt@gmail.com
 * Date of Creation: October 31st 2013
 */
public class AlbumElement implements IAlbumElement {
	private final String image;
	private final String title;
	private final String description;
	private final Uri location;
	
	
	/**
	 * 
	 * @param i the element's image
	 * @param t the element's title
	 * @param d the element's description
	 * @param l the element's location
	 */
	public AlbumElement(String i, String t, String d, Uri l){
		image =i;
		title = t;
		description = d;
		location = l;
	}

	@Override
	public String GetImage() {
		final String $ = image;
		return $;
	}

	@Override
	public String GetTitle() {
		return title;
	}

	@Override
	public String GetDescription() {
		return description;
	}

	@Override
	public Uri GetLocation() {
		return location;
	}

}
