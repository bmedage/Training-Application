package com.infosoft.bhushan;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class ReportService {

	Repository repository=Repository.getRepository();
	
	
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
}
