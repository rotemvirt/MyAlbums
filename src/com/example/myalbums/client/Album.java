package com.example.myalbums.client;

import java.util.Collection;
import java.util.LinkedList;

import android.net.Uri;


/**
 * 
 * @author Rotem Virt
 * gmail: rotemvirt@gmail.com
 * Date of Creation: November 1st 2013
 *
 */
public class Album implements IAlbum {
	
	private String name;
	private String description;
	private Collection<IAlbumElement> elements;
	private Collection<Uri> locations;
	
	/**
	 * 
	 * @param n The album's name
	 * @param d The album's description
	 */
	public Album(String n, String d){
		n = name;
		d = description;
		elements = new LinkedList<IAlbumElement>();
		locations = new LinkedList<Uri>();
	}


	@Override
	public Collection<IAlbumElement> GetElements() {
		final Collection<IAlbumElement> $ = elements;
		return $;
	}


	@Override
	public String GetName() {
		final String $ = name;
		return $;
	}

	@Override
	public String GetDescription() {
		final String $ = description;
		return $;
	}

	@Override
	public Collection<Uri> GetLocations() {
		final Collection<Uri> $ = locations;
		return $;
	}

	@Override
	public void AddElement(IAlbumElement e) {
		elements.add(e);
	}

	@Override
	public void RemoveElement(int i) throws AlbumIndexOutOfBounds {
		try{
			elements.remove(i);
		}catch(IndexOutOfBoundsException e){
			throw new AlbumIndexOutOfBounds();
		}
	}

	@Override
	public void SetName(String n) {
		name = n;
	}

	@Override
	public void SetDescription(String d) {
		description=d;
	}

	@Override
	public void AddLocation(Uri l) {
		if (locations.contains(l)){
			return;
		}
		locations.add(l);
	}

	@Override
	public void RemoveLocation(int i) throws AlbumIndexOutOfBounds {	
		try{
		locations.remove(i);
		}catch(IndexOutOfBoundsException e){
			throw new AlbumIndexOutOfBounds();
		}

	}

}