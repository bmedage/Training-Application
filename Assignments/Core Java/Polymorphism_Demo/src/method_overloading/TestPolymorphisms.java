package method_overloading;

class Calculate{
	
	void add(int a,int b){
		System.out.println("Addition is  :"+(a+b));
	}
	

	void add(float a,float b){
		System.out.println("Addition is  :"+(a+b));
	}
	
	void add(int a,float b){
		System.out.println("Addition is  :"+(a+b));
	}
	
}

public class TestPolymorphisms {

	public static void main(String[] args) {
		Calculate c=new Calculate();
		c.add(10,20);
		
		//c.add(10.5, 20.5);
		
		c.add(10.5F, 20.5F);
		
		c.add(30, 12.5F);
		c.add('A', 'B');
		
	}

}
