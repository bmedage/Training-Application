package com.infosoft.bhushan;

import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author Bhushan Medage
 *
 */
public class PEMService {
	
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
				
	}

	private void onAddCategory() {		
		
		System.out.println("Adding  Category .... ");
		
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
