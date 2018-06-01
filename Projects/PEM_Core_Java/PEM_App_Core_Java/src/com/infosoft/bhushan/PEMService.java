package com.infosoft.bhushan;

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
				System.out.println("Adding catagory.........!");
				break;
				
			case 0:
				System.exit(0);
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
	
	
}