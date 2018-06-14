package com.infotech.pem.controller;

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

@Controller
@RequestMapping("/user")
public class CategoryController {

	@Autowired
	 CategoryService catservice;
	
	@Autowired
	HttpSession session;	
	 User user; 	 
	 
	 
	 @RequestMapping(value="/addCategory.htm", method=RequestMethod.GET)
	  public ModelAndView showAddCategory(){		 
		 session.setAttribute("username", session.getAttribute("username"));
		 ModelAndView model=new ModelAndView("addCategory");
		 return model;
	  }
	 	 
	 
	 @RequestMapping(value="/submitCategory.htm", method=RequestMethod.POST)
	  public ModelAndView submitCategory( @ModelAttribute("app") Category category ){				 
		 String username= (String) session.getAttribute("username");
		  category.setUserid(username);				 
		 catservice.addCategory(category);
		 ModelAndView model=new ModelAndView("catAddSuccess");
		 model.addObject("msg","Category added Successfully..!!");	 		
		 return model;
	  }	 
	 
	
	 
	 @RequestMapping(value="/listCategory.htm")
		protected ModelAndView listAllCategory(HttpServletRequest request, HttpServletResponse response) throws Exception {			
		 ModelAndView model = new ModelAndView("listCategory");
			String userid=session.getAttribute("username").toString();			
			List<Category> catlist = new ArrayList<Category>();			
			catlist = catservice.listAllCategory(userid);			
			model.addObject("catlist", catlist);
			return model;
		}
	 
	 
	 @RequestMapping(value="/deleteCategory.htm")
		protected ModelAndView deleteCategory(HttpServletRequest request, HttpServletResponse response,@RequestParam("catid") int catid) throws Exception {
			
		 catservice.deleteCategory(catid);
		 
		 ModelAndView model = new ModelAndView("deleteCat");
			String userid=session.getAttribute("username").toString();
			List<Category> catlist = new ArrayList<Category>();			
			catlist = catservice.listAllCategory(userid);			
			model.addObject("catlist", catlist);
			return model;
		}
	 
	 @RequestMapping(value="/deleteCategoryProcess.htm")
		protected ModelAndView deleteCategoryProcess(HttpServletRequest request, HttpServletResponse response) throws Exception {
			 ModelAndView model = new ModelAndView("deleteCat");
			String userid=session.getAttribute("username").toString();
			List<Category> catlist = new ArrayList<Category>();			
			catlist = catservice.listAllCategory(userid);			
			model.addObject("catlist", catlist);
			return model;
		}
	
}
