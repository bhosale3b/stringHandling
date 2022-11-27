package stringHandling;

public class ImmutableAndMutable {
	
	public static void immutable() {//unchangable once memory created
		String s = "abc"; // used in String
		s.concat("pqr");
		System.out.println(s);//abc
		
	}
	
	public static void mutable() {//changable once memory created // stringbuffer and stringbuilder
		StringBuffer sb = new StringBuffer("abc"); // used in stringbuffer and stringbuilder
		sb.append("pqr");
		System.out.println(sb);//abcpqr
		
	}public static void main(String[] args) {
		immutable();
		mutable();
	}

}
