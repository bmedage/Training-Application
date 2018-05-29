
public class MutableStringDemo {

	public static void main(String[] args) {
		
        StringBuffer sb=new StringBuffer("Hello");
		
		System.out.println("sb::"+sb);
		System.out.println(sb.hashCode());
		
		sb.append("Friends");
		
		System.out.println("sb::"+sb);
		System.out.println(sb.hashCode());
		
		
		
		/*StringBuilder sb=new StringBuilder("Hello");
		
		System.out.println("sb::"+sb);
		System.out.println(sb.hashCode());
		
		sb.append("Friends");
		
		System.out.println("sb::"+sb);
		System.out.println(sb.hashCode());*/
		
	}

}
