package object_Array_Demo;

class Employee{
	private int id;
	private String name;
	
	
	public Employee(int a,String n) {
		
		id=a;
		name=n;		
	}
	
	void doTask(){
		
		System.out.println("Employee Doing Task..." + id + " " +name);
	}
	
}


public class TestEmp {

	public static void main(String[] args) {
		
	Employee[] emps=new Employee[3];
	
	Employee e=new Employee(1, "Bhushan");
	
	emps[0]=e;
	
	emps[1]=new Employee(2,"Ram");
	
	emps[2]=new Employee(3, "Anil");
			
	
	 for (Employee employee : emps) {
		 employee.doTask();
	}
	
	}

}
