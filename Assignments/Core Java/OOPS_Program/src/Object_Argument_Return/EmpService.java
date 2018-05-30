package Object_Argument_Return;

public class EmpService {

	/**
	 * 
	 * @param Employee as Argument
	 */
	public void save(Employee emp){
		
		System.out.println("----Save---"+emp.getId()+" "+emp.getName());
		
	}
	
	/**
	 * 
	 * @return Employee as return type
	 */
	 
	public Employee getEmployee(){
		Employee e=new Employee(12, "Raj");//dummy data
		return e;
	}
}
