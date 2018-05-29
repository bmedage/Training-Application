/*
	Author:Bhushan Medage
	Date:29/5/2018
	Desc: StringCmp Java Program 

*/
class StringCmp{
	
	public static void main(String args[]){
		String s1="Hello";
		String s2= new String("Hello");
			
		System.out.println(s1);
		System.out.println(s2);
				
		//reference Comparision
		
		System.out.println(s1==s2);
		
		//Value Comparision
		
		System.out.println(s1.equals(s2));
		
		String s3=s2;//assign reference 
		
		System.out.println(s2==s3);
		
	}
}