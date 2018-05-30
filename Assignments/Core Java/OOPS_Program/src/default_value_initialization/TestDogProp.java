package default_value_initialization;
/**
 * 
 * @author Bhushan Medage
 *
 */
class Dog{
	
	
	private int age;
	private String name; 
	
	Dog(){
		
		System.out.println("--------Default constuctor-------");
		age=3;//Default value
	}
	
	Dog(int a,String n){		
		
		System.out.println("--------Parameterized constuctor-------");
		age=a;
		name=n;
		
	}
	
	void eat(){
		System.out.println("The Dog is Esting.."+ age + " " +name );
	}
	
		
}

public class TestDogProp {

	public static void main(String[] args) {
				
		Dog d1=new Dog();			
		d1.eat();
		
		System.out.println();
		
		Dog d2=new Dog(8,"Tommy");
		d2.eat();
		
	}

}
