package propery_initialization;
/**
 * 
 * @author Bhushan Medage
 *
 */
class Dog{
	
	private int age;
	
	
	void eat(){
		System.out.println("The Dog is Esting.."+ age );
	}
	
	public void setAge(int a){
		if(a>0){
			age=a;
		}
		else{
			String errorMsg="Wrong Value for Age"+a;
			throw new IllegalArgumentException(errorMsg);
		}
		
	}
	
	public int getAge(){
		return age;
	}
	
}

public class TestDogProp {

	public static void main(String[] args) {
				
		Dog d1=new Dog();
		
		d1.setAge(10);
		
		d1.eat();
		
		System.out.println(d1.getAge());
		
	}

}
