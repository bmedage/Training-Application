
public class SBOperation {

	public static void main(String[] args) {
		
		//StringBuilder sb=new StringBuilder("Hello");
		
		StringBuffer sb=new StringBuffer("Hello");
		
		System.out.println(sb);
		System.out.println(sb.toString());
		System.out.println(sb.length());
		
		sb.append(" Friends");
		System.out.println(sb);
		
		
		sb.insert(4, "zzz");
		System.out.println(sb);
		
		sb.delete(4, 7);
		System.out.println(sb);
		
		System.out.println(sb.length());
		
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
		
		System.out.println(sb.charAt(6));
		
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		
		sb.replace(0, 5, "Welcome");
		System.out.println(sb);
	}

}
