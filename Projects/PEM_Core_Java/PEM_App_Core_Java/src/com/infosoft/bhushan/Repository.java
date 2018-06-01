package com.infosoft.bhushan;

import java.util.ArrayList;
import java.util.List;
/**
 * The class is used as Repositary/Database and this is a singleton class.
 * @author Bhushan Medage
 *
 */
public class Repository {

	/**
	 * The list hold all of Expense added by user
	 */
	public List<Expense> expList=new ArrayList();

	/**
	 * The list hold all of Categories added by user
	 */
	public List<Category> catList=new ArrayList();
	
	
	/**
	 * Singleton reference of Repository
	 */
	private static Repository repository;
	
	
	/**
	 * Private constructure to restrict object creation
	 */
	private Repository() {		
		
	}
	
	/**
	 * Provide the instance of Repository
	 * @return
	 */
	public static Repository getRepository(){
		
		if(repository==null){
			repository=new Repository();
		}
		
		return repository;
	}
		
}
