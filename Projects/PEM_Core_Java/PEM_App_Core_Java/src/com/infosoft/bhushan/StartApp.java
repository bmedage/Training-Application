package com.infosoft.bhushan;
/**
 * This class Start the execution of application which is Personal Expense Manager Application.
 *  
 * @author Bhushan Medage
 *
 */
public class StartApp {

	/**
	 * This methods is creating <code>PEMService</code> object and show application menu using showMenu() Methods
	 * @param args
	 */
	public static void main(String[] args) {
		PEMService pemService=new PEMService();
		pemService.showMenu();

	}

}
