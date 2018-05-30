package Object_Argument_Return;

public class Test {

	public static void main(String[] args) {
		
		Employee emp=new Employee(101, "Bhushan");
		
		EmpService service=new EmpService();
		
		service.save(emp);//Object as Argument
		
		
		Employee e=service.getEmployee();//Return value from Methods
		System.out.println("---emp----"+e.getId() +" " +e.getName());
	}

}
