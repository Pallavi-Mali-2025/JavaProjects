package StringMethods;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
	
		//String - Immutable 
		String s ="Welcome";
		s.concat("to java");
		System.out.println(s);
		
		//StringBuffer - mutable
		 StringBuffer sb = new StringBuffer("Welcome");
		 sb.append("to java");
		 System.out.println(sb);
		 
		//StringBuilder	  - mutable
		 StringBuilder sb1 = new StringBuilder("Java");
		 sb1.append("Selenium");
		 System.out.println(sb1);
		 
	}

}
