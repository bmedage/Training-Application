package com.infosoft.bhushan;

import java.beans.IntrospectionException;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 * @author Bhushan Medage
 *
 */
public class PEMService {
	
	private Repository repository=Repository.getRepository();
	private ReportService reportservice=new ReportService();
	
	private Scanner input=new Scanner(System.in);
	private Integer choice;
	
	public PEMService() {
		prepareSampleData();
	}
	
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
		
		List<Expense> expList=repository.expList;
		
		for(int i=0;i<expList.size();i++){
			Expense expense=expList.get(i);
			String categoryName=getCategoryNameById(expense.getCagetoryId());
			String dateString=DateUtil.dateToString(expense.getDate());
			System.out.println((i+1)+". "+categoryName+", "+expense.getAmount()+", "+expense.getRemark()+", "+dateString);
		}
	}

	 String getCategoryNameById(Long cagetoryId) {
		for(Category category: repository.catList){
			if(category.getCategoryId()==cagetoryId){
				return category.getName();
			}
		}
		return null; // if category id is not found
	}	
	 
	private void onExpenseEntry() {
		System.out.println("Add Detail for Expense Entry.......");
		onCategoryList();
		
		System.out.print("Enter Category : ");
		int categoryChoice=input.nextInt();
		
				
		Category selectedCategory=repository.catList.get(categoryChoice-1);
		System.out.println("Your Choice is : "+selectedCategory.getName());
		
		System.out.println("Enter Amount : ");
		Double expenseAmount=input.nextDouble();
		input.nextLine();
		
		System.out.print("Enter Remark : ");
		String expenseRemark=input.nextLine();
		
		
		System.out.print("Enter Date (dd/MM/yyyy) : ");
		String dateAsString=input.nextLine();
		
		Date date=DateUtil.stringToDate(dateAsString);
		
		
		Expense expense=new Expense();
		expense.setAmount(expenseAmount);
		expense.setRemark(expenseRemark);
		expense.setDate(date);
		expense.setCagetoryId(selectedCategory.getCategoryId());
		
		repository.expList.add(expense);
		
		System.out.println("Success : Expense detail added.....");
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
		Map<Integer, Float> resultMap=reportservice.calculateYearlyTotal();
		
		Set<Integer> years=resultMap.keySet();
		 
		Float total=0.0F;
		 
		 for (Integer year : years) {
			 Float exp=resultMap.get(year);
			 total=total+exp;
			 System.out.println(year+ ": "+exp);
			
		}
		 
		 System.out.println("--------------------------");
		 System.out.println("Total Expense(INR)"+total);
		 
		
	}

	private void onMonthlyExpenseList() {		
		System.out.println("Monthly Expense And Total..........");
		
		 Map<String, Float> resultMap=reportservice.calculateMonthlyTotal();
		 
		 Set<String> keys=resultMap.keySet();
		 
		 
		 
		 for (String yearMonth : keys) {
			 
			 String [] arr= yearMonth.split(",");
			 String year=arr[0];
			 Integer monthNo=new Integer(arr[1]);
			 String monthName=DateUtil.getMonthName(monthNo);
			 System.out.println(year+ " : "+ monthName +" : "+resultMap.get(yearMonth));
			
		}
		 
		
		 
		
	}
	private void pressAnyKeyToContinue() {
		try {
			System.out.println("Press any key to continue ......");
			System.in.read();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
			
	}

	
	public void prepareSampleData(){
		
		Category catParty=new Category("Party");
		delay();
		
		Category catShopping=new Category("Shopping");
		delay();
		
		Category catGift=new Category("Gift");
		delay();
		
		
		repository.catList.add(catParty);
		repository.catList.add(catShopping);
		repository.catList.add(catGift);
		
		//jan-2016
		Expense e1= new Expense(catParty.getCategoryId(),1000.0F,DateUtil.stringToDate("01/01/2016"),"N/A");
		delay();
		Expense e2= new Expense(catParty.getCategoryId(),2000.0F,DateUtil.stringToDate("02/01/2016"),"N/A");
		delay();
		
		//jan-2016
		Expense e3= new Expense(catShopping.getCategoryId(),500.0F,DateUtil.stringToDate("01/02/2016"),"N/A");
		delay();
		Expense e4= new Expense(catShopping.getCategoryId(),100.0F,DateUtil.stringToDate("02/02/2016"),"N/A");
		delay();
		
		
		
		//dec-2016
		Expense e5= new Expense(catGift.getCategoryId(),700.0F,DateUtil.stringToDate("01/12/2016"),"N/A");
		delay();
		
		
		
		//jan-2017
		Expense e6= new Expense(catParty.getCategoryId(),1500.0F,DateUtil.stringToDate("01/01/2017"),"N/A");
		delay();
		
		//Feb-2017
		Expense e7= new Expense(catShopping.getCategoryId(),200.0F,DateUtil.stringToDate("01/02/2017"),"N/A");
		
		
		
		//March-2017
		Expense e8= new Expense(catGift.getCategoryId(),1800.0F,DateUtil.stringToDate("01/03/2017"),"N/A");
		
		
		
		repository.expList.add(e1);
		repository.expList.add(e2);
		repository.expList.add(e3);
		repository.expList.add(e4);
		repository.expList.add(e5);
		repository.expList.add(e6);
		repository.expList.add(e7);
		repository.expList.add(e8);
		
			
		
	}
	
	
	public void delay(){
		try {
			Thread.sleep(10);
		} catch (InterruptedException ex) {
			
			ex.printStackTrace();
		}
		
	}
	
}
