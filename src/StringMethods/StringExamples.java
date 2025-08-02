package StringMethods;

public class StringExamples {

	public static void main(String[] args) {
		String s = "Welcome";
		System.out.println(s.length());
		System.out.println("Pallavi".length());
		
		//concat 
		
		String s1 = "Welcome";
		String s2 = "to java";
		System.out.println(s1.concat(s2));
		
		//trim 
		
		s = "   Welcome" ;
		System.out.println(s);
		System.out.println(s.trim());
		System.out.println(s.trim().length());
  
		
		//charAt()
		s = "Welcome";
		System.out.println(s.charAt(0));
		
		System.out.println(s.charAt(2));
		
		//Contains  - always return true or false
		System.out.println(s.contains("wel"));
		System.out.println(s.contains("come"));
		
		//equals()
		s1 = "welcome";
		s2 = "welcome";
		System.out.println("Equals method");
		System.out.println(s1.equals(s2));
		
	}

}
