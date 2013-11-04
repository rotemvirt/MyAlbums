package com.example.myalbums.client;

import android.graphics.Bitmap;
import android.net.Uri;

/*
 * Author: Rotem Virt 
 * gmail: rotemvirt@gmail.com
 * Date of Creation: October 31st 2013
 */
public interface IAlbumElement {
	
	/**
	 * 
	 * @return the element's image
	 */
	public Bitmap GetImage();
	
	/**
	 * 
	 * @return the element's title
	 */
	public String GetTitle();
	
	/**
	 * 
	 * @return the element's description
	 */
	public String GetDescription();
	
	/**
	 * 
	 * @return the element's location
	 */
	public Uri GetLocation();
}
