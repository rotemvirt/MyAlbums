package com.example.myalbums.client;

import java.util.List;



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
	public List<IAlbumElement> GetElements();
	
	
	/**
	 * Adds a given element to the page at the given index.
	 * @param e the element to be added
	 * @param i the current index of the element that will be the new element's next.
	 * @throws AlbumIndexOutOfBounds if i<0 or i>the size of the elements' list
	 */
	public void AddElement(IAlbumElement e, int i) throws AlbumIndexOutOfBounds;
	
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
