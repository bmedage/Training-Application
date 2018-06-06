package com.bhushan.infosoft.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * This class contains static methods for handle dates
 * @author Bhushan Medage
 *
 */
public class DateUtil {
	
	public static String[] MONTHS={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	
	
	/**
	 * This methods converts string date to date object
	 * @param dateInString
	 * @return
	 */
	public static Date stringToDate(String dateInString){
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		try {
			return df.parse(dateInString);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * This Methods converts date object to date String  
	 * @param date
	 * @return
	 */
	public static String dateToString(Date date){
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		return df.format(date);		
	}

	
	
	/**
	 * This mehods return year and month
	 * @param expDate
	 * @return
	 */
	public static String getYearAndMonth(String expDate){
		SimpleDateFormat df=new SimpleDateFormat("yyyy,MM");
		return df.format(expDate);		
	}
	
	/**
	 * This methods returns year from date
	 * @param date
	 * @return
	 */
	public static Integer getYearFromDate(Date date){
		SimpleDateFormat df=new SimpleDateFormat("yyyy");
		return new Integer(df.format(date));		
	}
	
	
	/**
	 * This methods is used for finding month name from month number
	 * @param monthNo
	 * @return
	 */
	public static String getMonthName(Integer monthNo){
		return MONTHS[ monthNo-1];
	}
}
