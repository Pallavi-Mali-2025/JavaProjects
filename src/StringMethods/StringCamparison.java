package StringMethods;

public class StringCamparison {

	public static void main(String[] args) {
		
		//sc1
		/*String s1 ="Welcome";
		String s2 ="Welcome";
		 System.out.println(s1==s2);
		 System.out.println(s1.equals(s2));*/
		
		//Case2 
		/* String s1 = new String ("Welcome");
		 String s2 = new String("Welcome");
		 System.out.println(s1);
		 System.out.println(s2);
		 
		 System.out.println(s1==s2); //false - it campare objects
		 System.out.println(s1.equals(s2));//true - it campare value of objects
        */
		
		//case3 
		String s1 ="abc";
		String s2 = new String("abc");
		String s3 =s2;
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2==s3); 
		
		
	}

}
