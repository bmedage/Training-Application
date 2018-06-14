package com.infotech.pem.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.infotech.pem.model.Category;
import com.infotech.pem.model.Expense;
import com.infotech.pem.model.User;
import com.infotech.pem.service.CategoryService;
import com.infotech.pem.service.ExpenseService;
import com.infotech.pem.service.UserService;

/**
 * This controller for Expenses.
 * In this controller all Expense related operation is to be managed
 * like Add Expenses, Delete Expense, List Expense, And To Genrate Various Type of Report of Expense. 
 * @author Bhushan Medage
 *
 */
@Controller
@RequestMapping("/user")
public class ExpensesController {
	
	@Autowired
	HttpSession session;	
	
	 User user;
		
	@Autowired
	 ExpenseService expservice;
	
	@Autowired
	 CategoryService catservice;
	 
	 @RequestMapping(value="/addExpenses.htm", method=RequestMethod.GET)
	  public ModelAndView addExpenses(){		 
		 session.setAttribute("username", session.getAttribute("username"));
		 ModelAndView model=new ModelAndView("addExpense");		 
		 String userid=session.getAttribute("username").toString();
		 List<Category> catlist = new ArrayList<Category>();			
		 catlist = catservice.listAllCategory(userid);
		 model.addObject("catList", catlist);			
		 return model;
	  }
	 
	 
	 
	 @RequestMapping(value="/submitExpenses.htm", method=RequestMethod.POST)
	  public ModelAndView submitExpenses( @ModelAttribute("app") Expense expenses ){				 
		 String username= (String) session.getAttribute("username");		
		 expenses.setUserid(username);				 
		 expservice.addExpense(expenses);
		 ModelAndView model=new ModelAndView("expAddSuccess");
		 model.addObject("msg","Expense added Successfully..!!");	 		
		 return model;
	  }
	 
	 
	 @RequestMapping(value="/listExpenses.htm")
		protected ModelAndView listAllExpenses(HttpServletRequest request, HttpServletResponse response) throws Exception {			
		 ModelAndView model = new ModelAndView("listExpense");
			String userid=session.getAttribute("username").toString();		
			List<Expense> explist = new ArrayList<Expense>();			
			explist = expservice.listAllExpense(userid);						
			model.addObject("explist", explist);
			return model;
		}
	 
	 
	 @RequestMapping(value="/listMonthlyExpenses.htm")
		protected ModelAndView listMonthlyExpenses(HttpServletRequest request, HttpServletResponse response) throws Exception {			
		 ModelAndView model = new ModelAndView("showListMontlyExp");
			String userid=session.getAttribute("username").toString();					
			List<Expense> explist = new ArrayList<Expense>();			
			explist = expservice.listMonthalyExpense(userid);			
			model.addObject("explist", explist);
			return model;
		}
	 
	 
	 
	 @RequestMapping(value="/listYearlyExpenses.htm")
		protected ModelAndView listYearlyExpenses(HttpServletRequest request, HttpServletResponse response) throws Exception {			
		 ModelAndView model = new ModelAndView("expListByYear");
			String userid=session.getAttribute("username").toString();					
			List<Expense> explist = new ArrayList<Expense>();			
			explist = expservice.listYearlyExpense(userid);							
			model.addObject("explist", explist);
			return model;
		}
	 
	 
	 @RequestMapping(value="/listCategoryWiseExpenses.htm")
		protected ModelAndView listCategoryWiseExpenses(HttpServletRequest request, HttpServletResponse response) throws Exception {			
		 ModelAndView model = new ModelAndView("categoryListDisplay");
			String userid=session.getAttribute("username").toString();					
			List<Expense> explist = new ArrayList<Expense>();			
			explist = expservice.listCategoryWise(userid);				
			model.addObject("explist", explist);
			return model;
		}
	 
	 @RequestMapping(value="/deleteExpenses.htm")
		protected ModelAndView deleteExpenses(HttpServletRequest request, HttpServletResponse response,@RequestParam("expid") int expid) throws Exception {			
		 expservice.deleteExpenses(expid);		 
		 ModelAndView model = new ModelAndView("deleteExp");
			String userid=session.getAttribute("username").toString();
			List<Expense> explist = new ArrayList<Expense>();			
			explist = expservice.listAllExpense(userid);				
			model.addObject("explist", explist);
			return model;
		}
	 
	 @RequestMapping(value="/deleteExpensesProcess.htm")
		protected ModelAndView deleteExpensesProcess(HttpServletRequest request, HttpServletResponse response) throws Exception {
			 ModelAndView model = new ModelAndView("deleteExp");
			String userid=session.getAttribute("username").toString();					
			List<Expense> explist = new ArrayList<Expense>();			
			explist = expservice.listAllExpense(userid);						
			model.addObject("explist", explist);
			return model;
		}
	
	
}
	