package com.infosoft.bhushan;

import java.util.ArrayList;
import java.util.List;
/**
 * The class is used as Repositary/Database and this is a singleton class.
 * @author Bhushan Medage
 *
 */
public class Repository {

	public List<Expense> expList=new ArrayList<>();
	public List<Category> catList=new ArrayList<>();
	
	private static Repository repository;
	
	private Repository() {		
		
	}
	
	public static Repository getRepository(){
		
		if(repository==null){
			repository=new Repository();
		}
		
		return repository;
	}
		
}
