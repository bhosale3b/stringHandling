package stringHandling;

public class StringTest {
	public static void main(String[] args) {
		 
		String s1 = "abc"; // by litral 
		String s2 = new String ("abc"); // by new keyword // used in stringbuffer and string builder
		String s3 = "abc";
		String s4 = "pqr";
		String s5 = new String ("xyz");
		
		System.out.println("s1" +s1.hashCode());
		System.out.println("s2" +s2.hashCode());
		System.out.println("s3" +s3.hashCode());
		System.out.println("s4" +s4.hashCode());
		System.out.println("s5" +s5.hashCode());
		
		System.out.println("--------------------");
		
		System.out.println(s1.equals(s2));//true // content same
		System.out.println(s1.equals(s3));//true // content same
		System.out.println(s1.equals(s4));//false //content and memory location diffent
		System.out.println(s1.equals(s5));//false //content and memory location diffent
		
		System.out.println("--------------------");
		
		System.out.println(s1==s2); //false // memory location diffent // bec of hashcode (identical hashcode)
		System.out.println(s1==s3); //true
		System.out.println(s1==s4); //false //content and memory location diffent
		System.out.println(s1==s5); //false //content and memory location diffent
		
		int a=10;
		int b=10;
		
		if(a==b)
			System.out.println("a is equals to b");
				
	}

}
