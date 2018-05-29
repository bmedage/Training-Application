
public class StringOperationDemo {

	public static void main(String[] args) {
		
		String s="Hello Friends";
		System.out.println("Lenght::"+s.length());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		System.out.println(s.charAt(6));
		
		
		System.out.println(s.indexOf('e'));
		System.out.println(s.lastIndexOf('e'));
		
		System.out.println(s.substring(6));//6 till end
		System.out.println(s.substring(6, 9));//m to n-1
		
		System.out.println(s.replace("e", "Z"));
		
		System.out.println(s);
		
		System.out.println(s.concat(" Welcome in Java"));
		
		String ss=s + " Welcome.....!";
		
		System.out.println(ss);
		
		String s2="p1,p2,p3,p4,p5";
		
		System.out.println(s2);
		String[] arr=s2.split(",");
		
		for (String p : arr) {
			
			System.out.println(p);
		}
		
		String s3="";
		System.out.println(s3.length());
		System.out.println(s3.isEmpty());
		
		System.out.println(s.contains("Hello"));
		System.out.println(s.contains("om"));
		
		
		System.out.println(s.startsWith("Hello"));
		System.out.println(s.endsWith("s"));
		
		
		/*String s4=null;
		//System.out.println(s4.length()); Throw exception 
		System.out.println(s4);*/
	}

}
