package OppsConcept;

public class Employee {
	int eid;
	String ename;
	String job;
	int sal;
	
	
	void Display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.eid=101;
		emp.ename="pallavi";
		emp.job="Java Developer";
		emp.sal=100000;
		emp.Display();

}
}