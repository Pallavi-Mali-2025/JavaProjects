package StringMethods;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		//mutable
		int a[] = {20,30,60,70,10};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);//Mutable - change original values 
		System.out.println(Arrays.toString(a));
		
		//immutable 
		String s = "Welcome";
		
		System.out.println(s.concat("to java"));

	}

}
