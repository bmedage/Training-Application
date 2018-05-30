package this_keyword;

class Emp {

	 private int id;
	 private String name;
	
	 
	public Emp(int id,String name) {
		this.id=id;
		this.name=name;
	}
	 
	void doTask(){
		
	System.out.println("-----Emp Task-----"+this.id + " " +this.name);		
	
	}
}


public class TestThisDemo {

	public static void main(String[] args) {
		
		Emp e=new Emp(101,"Bhushan");		
		
		e.doTask();
	}

}
