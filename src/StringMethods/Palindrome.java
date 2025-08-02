package StringMethods;

public class Palindrome {

	public static void main(String[] args) {
		
		String original = "madama";
		StringBuilder s = new StringBuilder(original);
		System.out.println("Original String" +s);
		System.out.println("Reverse String" +s.reverse());
		
		if(original.equalsIgnoreCase(s.toString())) {
			
			System.out.println("Palindrome ");
		}
		else {
			System.out.println("Not Palindrom");
		}

	}

}
