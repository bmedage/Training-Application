package class_and_object;
/**
 * 
 * @author Bhushan Medage
 *
 */
class Dog{
	
	int age;
	String name;
	
	void eat(){
		System.out.println("The Dog is Esting.."+ name +" "+ age );
	}
}


public class TestDog {

	public static void main(String[] args) {
		/**
		 * Reference Only Not Objects
		 */
		Dog d1;		
		
		/**
		 * Objects is created
		 */
		d1=new Dog();
		
		d1.age=10;
		d1.name="Tommy";
		d1.eat();
		
		Dog d2=new Dog();
		d2.age=6;
		d2.name="Moti";
		d2.eat();
		
		/**
		 * assign Refferences
		 */
		Dog d3=d2;
		
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d3.hashCode());
	}

}
