package first_inheritance;

class Animal{
	
	private String name;
	
	void eat(){
		
		System.out.println("The Animal is Eating..."+name);
	}
	
	
	void run(){
		
		System.out.println("The Animal is Running..."+name);
	}
}


class Dog extends Animal{
	
	void bark(){
		System.out.println("The Dog is barking");
	}
}


class Cat extends Animal{
	
	void bite(){
		System.out.println("The Cat is biting");
	}
}

public class TestInheritence {

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
