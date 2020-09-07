package org.koushik.javabrains.business;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl {
	
	List<String> bookList = new ArrayList<String>();
	List<String> musicList = new ArrayList<String>();
	List<String> movieList = new ArrayList<String>();
	
	public ProductServiceImpl() {
		
		bookList.add("Wings of fire");
		bookList.add("Game of thrones");
		bookList.add("Inferno");
		
		musicList.add("Jazz");
		musicList.add("Pop");
		musicList.add("Classical");
		
		movieList.add("Breath");
		movieList.add("Sacred games");
		movieList.add("Bard of Blood");
	}
	

	public List<String> getProductCategories(){
		
		List<String> categories = new ArrayList<String>();
		
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		
		return categories;
	}
	
	
	public List<String> getProducts(String category){
		
		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		}
		return null;
	}
	
	public boolean addProduct(String category, String product) {
		
		switch (category.toLowerCase()) {
		case "books":
			bookList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
		case "movies":
			movieList.add(product);
			break;
		default:
			return false;
		}
		return true;
		
	}


}
