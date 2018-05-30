package constructor_demo;
/**
 * 
 * @author Bhushan Medage
 *
 */
class Dog{
	
	/**
	 * Default value for age
	 */
	 int age=5;
	
	
	void eat(){
		System.out.println("The Dog is Esting.."+ age );
	}
	
		
}

public class TestDogProp {

	public static void main(String[] args) {
				
		Dog d1=new Dog();			
		d1.eat();
		
		Dog d2=new Dog();			
		d2.age=10;
		d2.eat();
		
	}

}
