package StringMethods;

public class ReverseString {

	public static void main(String[] args) {
		//Approch 1
		
		/*String  s = "Welcome";
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);*/

		
		//Approch2 String Buffer
		 
	   /*StringBuffer s = new StringBuffer("Welcome");
	   System.out.println("Reverse String" +"  " +s.reverse());*/
		
	 //Approch3 String Builder
		
		StringBuilder s = new StringBuilder("Welcome");
		System.out.println("Reverse String" +"  " +s.reverse());
	   
		
	}

}
