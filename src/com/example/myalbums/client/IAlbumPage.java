package com.example.myalbums.client;

import java.util.Collection;



/**
 * 
 * @author Rotem
 * gmail: rotemvirt@gmail.com
 * Date of Creation: November 4th 2013
 */
public interface IAlbumPage {
	
	/**
	 * 
	 * @return the page's elements
	 */
	public Collection<IAlbumElement> GetElements();
	
	
	/**
	 * Adds a given element to the page at the end of it.
	 * @param e the element to be added
	 */
	public void AddElement(IAlbumElement e);
	
	/**
	 * Removes a specific element from the page.
	 * @param i the index of the element to be removed
	 * @throws AlbumIndexOutOfBounds when the given index is 
	 * out of the elements' list bounds.
	 */
	public void RemoveElement(int i) throws AlbumIndexOutOfBounds;
	
	/**
	 * 
	 * @return the page's type.
	 */
	public PageType GetType();
	

}
