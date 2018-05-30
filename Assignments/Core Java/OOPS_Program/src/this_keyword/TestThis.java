package this_keyword;

 class Employee {

	 int id;
	 String name;
	
	void doTask(){
		
	System.out.println("-----Emp Task-----"+this.id + " " +this.name);		
	System.out.println("-----Emp Task-----"+id + " " +name);	
	System.out.println("this "+this.hashCode());
	
	this.test();//calling same class methods
	
	//test();
	}
	
	void test(){
		System.out.println("--------Tesing----------");
	}
}

public class TestThis {

	public static void main(String[] args) {
	
	Employee e1=new Employee();
	e1.id=101;
	e1.name="Bhushan";
			
	e1.doTask();
	System.out.println("e1:"+e1.hashCode());
	

	}
}
