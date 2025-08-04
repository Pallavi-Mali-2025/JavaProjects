package OppsConcept;

public class Greetings {
// NO Parameter   no arguments
	void m1()
	{
		System.out.println("Hello from m1() method");
	}
	
	// NO Parameter Return value
	
	String m2()
	{
		return ("Hello from m2()");
	}
	
	// Takes parameter No return value
	void m3 (String name)
	{
		System.out.println("Hello"+" " +name);
		
	}
	
	//takes parameter also return value
	
	String m4(String name)
	{
		return "hello" +name;
	}
}
