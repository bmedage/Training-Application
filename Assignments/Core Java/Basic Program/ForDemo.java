/*
	Author:Bhushan Medage
	Date:29/5/2018
	Desc: Using for and if Java Program 

*/
class ForDemo{
	
	public static void main(String args[]){
		int sum=0;
		for(int i=1;i<=10;i++){		
			
			if(i%2==0){
				System.out.println(i);
				sum=sum+i;
			}
					
			
		}
		System.out.println(" Sum of even number::"+sum);
	}
}