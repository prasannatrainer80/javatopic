
public class Employ {

	private int empno;
	private String name;
	private double salary;
	
	public Employ() {

	}

	public Employ(int empno, String name, double salary) {
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
