
public class ImmutableString {

	public static void main(String[] args) {
		
		String s1="Hello";
		String s2="Friends";
		
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		s1=s1+s2;//Concat
		System.out.println(s1);
		System.out.println(s1.hashCode());

	}

}
