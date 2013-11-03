package com.example.myalbums.client;


import java.util.Collection;

import android.net.Uri;

/*
 * Author: Rotem Virt
 * gmail: rotemvirt@gmail.com
 * Date of Creation: November 1st 2013
 */
public interface IAlbum {
	/**
	 * 
	 * @return the album's elements
	 */
	
	public Collection<IAlbumElement> GetElements();
	/**
	 * 
	 * @return the album's name
	 */
	public String GetName();
	
	/**
	 * 
	 * @return the album's description
	 */
	public String GetDescription();
	
	/**
	 * 
	 * @return the album's locations
	 */
	public Collection<Uri> GetLocations();
	
	/**
	 * Adds a given element to the album at the end of it.
	 * @param e the element to be added
	 */
	public void AddElement(IAlbumElement e);
	
	/**
	 * Removes a specific element from the album.
	 * @param i the index of the element to be removed
	 * @throws AlbumIndexOutOfBounds when the given index is 
	 * out of the elements' list bounds.
	 */
	public void RemoveElement(int i) throws AlbumIndexOutOfBounds;
	
	/**
	 * Changes the album's name
	 * @param n the new name
	 */
	public void SetName(String n);
	
	/**
	 * Changes the album's description
	 * @param d the new description
	 */
	public void SetDescription(String d);
	
	/**
	 * Adds a given location to the album. Does nothing if
	 * the location is already listed.
	 * @param l the location to be added.
	 */
	public void AddLocation(Uri l);	
	
	/**
	 * Removes a specific location from the album.
	 * @param i the index of the location to be removed.
	 * @throws AlbumIndexOutOfBounds when the given index is 
	 * out of the locations' list bounds.
	 */
	public void RemoveLocation(int i) throws AlbumIndexOutOfBounds;

}
