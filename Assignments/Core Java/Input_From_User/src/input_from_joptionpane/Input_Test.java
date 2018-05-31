package input_from_joptionpane;

import javax.swing.JOptionPane;

public class Input_Test {

	public static void main(String[] args) {
		
		String name=JOptionPane.showInputDialog("Your name::");
		System.out.println("Name::"+name);
		
		String salary=JOptionPane.showInputDialog("Your Salary::");
		Float sal=new Float(salary);
		System.out.println("salary::"+sal);
		
		
		String age=JOptionPane.showInputDialog("Your age::");
		Integer agee=new Integer(age);
		System.out.println("Age::"+agee);
	}

}
