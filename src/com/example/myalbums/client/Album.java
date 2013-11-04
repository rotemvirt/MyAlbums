package com.example.myalbums.client;

import java.util.List;
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
	private List<IAlbumPage> pages;
	private List<Uri> locations;
	
	/**
	 * 
	 * @param n The album's name
	 * @param d The album's description
	 */
	public Album(String n, String d){
		name = n;
		description = d;
		pages = new LinkedList<IAlbumPage>();
		locations = new LinkedList<Uri>();
	}


	@Override
	public List<IAlbumPage> GetPages() {
		final List<IAlbumPage> $ = pages;
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
	public List<Uri> GetLocations() {
		final List<Uri> $ = locations;
		return $;
	}

	@Override
	public void AddPage(IAlbumPage p, int i) throws AlbumIndexOutOfBounds {
		try{
			pages.add(i,p);
		}catch(IndexOutOfBoundsException e){
			throw new AlbumIndexOutOfBounds();
		}
	}

	@Override
	public void RemovePage(int i) throws AlbumIndexOutOfBounds {
		try{
			pages.remove(i);
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
