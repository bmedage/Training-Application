package com.infosoft.bhushan;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
/**
 * This class contain various methods for genrate the reports
 * @author Bhushan Medage
 *
 */
public class ReportService {

	/**
	 * Declare the reference of singleton Repository class
	 */
	Repository repository=Repository.getRepository();
	
	
	
	/**
	 * This method calculate Expense report Monthly
	 * It uses<code>Repository</code> for jaunting the report monthly
	 * @return
	 */
	public Map<String, Float> calculateMonthlyTotal(){
		
		Map<String, Float> m=new TreeMap<>();
		
		for (Expense exp : repository.expList) {
			
			Date expDate=exp.getDate();
			
			String yearMonth=DateUtil.getYearAndMonth(expDate);
			if(m.containsKey(yearMonth)){
				Float total=m.get(yearMonth);
				total=(float) (total + exp.getAmount());
				m.put(yearMonth, total);
			}
			else{
				m.put(yearMonth, (float) exp.getAmount());
			}
			
		}
		return m;
	}
	
	
	
	/**
	 * This method calculate Expense report Yearly
	 * It uses<code>Repository</code> for jaunting the report yearly
	 * @return
	 */
	public Map<Integer, Float> calculateYearlyTotal(){
		
		Map<Integer, Float> m=new TreeMap();
		
		for (Expense exp : repository.expList) {
			
			Date expDate=exp.getDate();
			
			Integer yearFomDate=DateUtil.getYearFromDate(expDate);
			if(m.containsKey(yearFomDate)){
				Float total=m.get(yearFomDate);
				total=(float) (total + exp.getAmount());
				m.put(yearFomDate, total);
			}
			else{
				m.put(yearFomDate, (float) exp.getAmount());
			}
			
		}
		return m;
	}
	
	
	/**
	 * This method calculate Expense report Category wise
	 * It uses<code>Repository</code> for jaunting the report of category wise
	 * @return
	 */
	public Map<String, Float> calculateCategorizedTotal(){
		
		Map<String, Float> m=new TreeMap();
		
		for (Expense exp : repository.expList) {
		   Long categoryId=exp.getCagetoryId();
		   
		   String catName=this.getCategoryNameById(categoryId);
			if(m.containsKey(catName)){
				Float total=m.get(catName);
				total=(float) (total + exp.getAmount());
				m.put(catName, total);
			}
			else{
				m.put(catName, (float) exp.getAmount());
			}
			
		}
		return m;
	}
	
	/**
	 * This method is used to find category name from category Id
	 * @param cagetoryId
	 * @return
	 */
	public String getCategoryNameById(Long cagetoryId) {
		for(Category category: repository.catList){
			if(category.getCategoryId()==cagetoryId){
				return category.getName();
			}
		}
		return null; // if category id is not found
	}	
}
