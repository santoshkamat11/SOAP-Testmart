package org.koushik.javabrains;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService
public class ProductCatalog {
	
public List<String> getProductCategories(){
		
		List<String> categories = new ArrayList<String>();
		
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		
		return categories;
	}

}
