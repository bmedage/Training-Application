package input_from_keyboard;
import java.util.Scanner;

public class TestInput {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("Enter Value for Integer a :");
		int a=sc.nextInt();		
		System.out.println("a="+a);
		
		
		System.out.println("Enter Value for Float b :");
		float  b=sc.nextFloat();		
		System.out.println("b="+b);
		
		System.out.println("Enter Value for String name:");
		String name=sc.next();	
		System.out.println("Name="+name);
		
		sc.nextLine();//second word
		
		System.out.println("Enter Value for Line:");
		String line=sc.nextLine();	
		System.out.println("Line="+line);
		
		
		
		
	}

}
