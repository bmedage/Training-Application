package super_keyword;

class Animal{
	
	private String name;
	
	public Animal(){
		System.out.println("-----------Degault Animal--------------");
	}
	
	public Animal(String name){
		System.out.println("-----------Parameterized Animal--------------");
		this.name=name;
	}
	
	
	void eat(){
		
		System.out.println("The Animal is Eating..."+name);
	}
	

}


class Dog extends Animal{
	
	private int age;
	
	
	public Dog(){
		//super();
		System.out.println("-----------Degault Dog--------------");
	}
	
	public Dog(int age,String name){
		super(name);
		
		System.out.println("----para Dog------");
		this.age=age;
		
		
	}
	
	void bark(){
		System.out.println("The Dog is barking"+age);
	}
}




public class TestSuper {

	public static void main(String[] args) {
		
		Dog d=new Dog();
		d.bark();
		d.eat();		
		
		
		
		System.out.println("-------------------------------");
		
		Dog dd=new Dog(10,"Tommy");
		dd.bark();
		dd.eat();

	}

}
