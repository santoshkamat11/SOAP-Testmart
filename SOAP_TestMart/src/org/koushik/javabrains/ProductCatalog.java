package org.koushik.javabrains;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.koushik.javabrains.business.ProductServiceImpl;



@WebService
public class ProductCatalog {
	
	ProductServiceImpl productServiceImpl = new ProductServiceImpl();
	
	@WebMethod
	public List<String> getProductCategories(){
		return productServiceImpl.getProductCategories();
	}
	
	@WebMethod
	public List<String> getProducts(String category){
		return productServiceImpl.getProducts(category);
	}
	
	@WebMethod
	public boolean addProduct(String category , String product) {
		
		return productServiceImpl.addProduct(category, product);
	}
	
	

}
