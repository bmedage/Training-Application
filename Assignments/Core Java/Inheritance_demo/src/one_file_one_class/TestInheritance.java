package one_file_one_class;
public class TestInheritance {
	
	public static void main(String[] args) {
		Dog d=new Dog();
		d.bark();
		d.eat();//reused
		d.run();//reused
		
		
		System.out.println();
		
		Cat c=new Cat();
		c.eat();//reused
		c.run();//reused
		c.bite();
	}

}
