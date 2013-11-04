package com.example.myalbums.client;

import java.util.List;
import java.util.LinkedList;

public class AlbumPage implements IAlbumPage {
	
	public AlbumPage(PageType t){
		type = t;
		if(t==null){
			type = PageType.REGULAR;
		}
		elements = new LinkedList<IAlbumElement>();
	}
	
	List<IAlbumElement> elements;
	PageType type;

	@Override
	public List<IAlbumElement> GetElements() {
		List<IAlbumElement> $ = elements;
		return $;
	}

	@Override
	public void AddElement(IAlbumElement e, int i) throws AlbumIndexOutOfBounds {		
		try{
			elements.add(i,e);
		}catch(IndexOutOfBoundsException e1){
			throw new AlbumIndexOutOfBounds();
		}
		

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
	public PageType GetType() {
		PageType $ = type;
		return $;
	}

}
