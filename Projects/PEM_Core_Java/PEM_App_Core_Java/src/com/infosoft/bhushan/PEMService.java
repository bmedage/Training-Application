package com.infosoft.bhushan;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Bhushan Medage
 *
 */
public class PEMService {
	
	Repository repository=Repository.getRepository();
	
	private Scanner input=new Scanner(System.in);
	private Integer choice;
	
	
	
	public void showMenu(){
		
		while(true){
			
			printMenu();
			
			switch (choice) {			
			case 1:
				onAddCategory();
				pressAnyKeyToContinue();
				break;
				
			case 2:
				onCategoryList();
				pressAnyKeyToContinue();
				break;
				
			case 3:
				onExpenseEntry();
				pressAnyKeyToContinue();
				break;
				
			case 4:
				onExpenseList();
				pressAnyKeyToContinue();
				break;
				
			case 5:
				onMonthlyExpenseList();
				pressAnyKeyToContinue();
				break;
				
			case 6:
				onYearlyExpenseList();
				pressAnyKeyToContinue();
				break;
				
			case 7:
				onCategorizedExpenseList();
				pressAnyKeyToContinue();
				break;
				
			case 0:
				menuExit();
				break;

			
			}
			
		}
	}

	
	private void printMenu(){
				System.out.println("------------PEM Menu------------");
				System.out.println("1. Add Category");
				System.out.println("2. Category List");
				System.out.println("3. Expense Entry");
				System.out.println("4. Expense List");
				System.out.println("5. Monthly Expense List");
				System.out.println("6. Yearly Expense List");
				System.out.println("7. Categoriezed Expense List");
				System.out.println("0. Exit");
				System.out.println("-------------------------------");
				System.out.print("Enter your choice : ");
				choice=input.nextInt();
	}
	
	private void menuExit() {
		System.exit(0);
	}

	
	private void onExpenseList() {
		System.out.println("Expense Listing.......");
	}

	
	private void onExpenseEntry() {
		System.out.println("Add Detail for Expense Entry.......");
	}

	private void onCategoryList() { 
		
		System.out.println("Category Listing.......");
		List<Category> catList=repository.catList;
		for(int i=0;i<catList.size();i++){
			Category category=catList.get(i);
			System.out.println((i+1)+". "+category.getName()+", "+category.getCategoryId());
		}
	}

	private void onAddCategory() {		
		
		input.nextLine();
		System.out.print("Add Category Name : ");
		String categoryName=input.nextLine();
		Category category=new Category(categoryName);
		repository.catList.add(category);
		System.out.println("Success : Category Added....");	
		
	}
	
	
		
	private void onCategorizedExpenseList() {		
		System.out.println("Categorized Expense Listing..........");
		
	}

	private void onYearlyExpenseList() {		
		System.out.println("Yearly Expense Listing..........");
		
		
	}

	private void onMonthlyExpenseList() {		
		System.out.println("Monthly Expense Listing..........");
		
	}
	private void pressAnyKeyToContinue() {
		try {
			System.out.println("Press any key to continue ......");
			System.in.read();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
			
	}

	
}
