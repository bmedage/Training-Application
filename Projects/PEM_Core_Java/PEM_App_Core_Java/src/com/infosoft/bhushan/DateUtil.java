package com.infosoft.bhushan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static Date stringToDate(String dateInString){
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		try {
			return df.parse(dateInString);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static String dateToString(Date date){
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		return df.format(date);		
	}

}
