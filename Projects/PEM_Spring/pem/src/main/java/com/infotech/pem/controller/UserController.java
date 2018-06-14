package com.infotech.pem.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.infotech.pem.model.User;
import com.infotech.pem.service.UserService;
/**
 * This controller for user.
 * In this controller all user related operation is to be managed
 * like login,Register etc. 
 * @author Bhushan Medage
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired	
	UserService service;
	
	@Autowired
	HttpSession session;
	
	 User user;
	 
	 
	 @RequestMapping(value="/home.htm", method=RequestMethod.GET)
	 public ModelAndView showHomePage(){
		 ModelAndView model=new ModelAndView("home");
		 return model;
		 		 
	  }
	
	@RequestMapping(value="/login.htm", method=RequestMethod.GET)
	  public ModelAndView showloginPage(){		
		 ModelAndView model=new ModelAndView("login");
		 return model;
	  }
	 
	 
	 
	 @RequestMapping(value="/userRegister.htm", method=RequestMethod.GET)
	  public ModelAndView showRegisterPage(){		
		 ModelAndView model=new ModelAndView("registration");
		 return model;
	  }
	
	
	 @RequestMapping(value="/submitUserRegister.htm", method=RequestMethod.POST)
	  public ModelAndView submitUserRegisterPage( User user,@RequestParam("loginName")String loginName){		 	
				 
		 try{
			 user=service.loginUser(loginName);
			 }
			 catch(Exception e){
				 service.userRegistration(user);
				 ModelAndView model=new ModelAndView("login");
				 model.addObject("msg","Registration Success....!");
				 return model;
			 }
			 if(user.getLoginName().equals(loginName)){				 
			 ModelAndView model=new ModelAndView("registration");
			 model.addObject("msg"," Login Name Already present Please Enter another Login Name...!");
			 return model;
			 }
			 ModelAndView model=new ModelAndView("login");
			 model.addObject("msg","Registration Success....!");
			 return model;		 
	  }
	 
	 
	 
	 @RequestMapping(value="/logincheck.htm", method=RequestMethod.POST)
    public ModelAndView showUser(HttpServletRequest request,HttpServletResponse response,@RequestParam("username")String username,@RequestParam("password")String password){
		
		 try{
		  user=service.loginUser(username);
		 }
		 catch(Exception e){
			 ModelAndView model=new ModelAndView("login");
			 model.addObject("msg","Wrong username or Password...!!");
			 return model;
		 }
		 if(user.getPassword().equals(password)){
			  session=request.getSession();
			
			 session.setAttribute("name", user.getName());
			 session.setAttribute("username", user.getLoginName());
		 ModelAndView model=new ModelAndView("welcome");
		 model.addObject("msg",session.getAttribute("name"));
		 return model;
		 }
		 else {			 
			 ModelAndView model=new ModelAndView("login");
			 model.addObject("msg","Wrong username or Password...!!");
			 return model;
		 }	 

	 }
	 
	 @RequestMapping(value="/logout.htm", method=RequestMethod.GET)
	  public ModelAndView logoutPage(){
		
		 ModelAndView model=new ModelAndView("logoutProcess");
		 model.addObject("msg","Logout Success..!!");
		 return model;
	  }

	
}
