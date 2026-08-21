import java.util.Vector;

public class Example2 {
	public static void main(String[] args) {
		Vector v = new Vector(3,2);
		System.out.println("Vector Size  " +v.size());
		System.out.println("Capacity  " +v.capacity());
		
		v.addElement("Siri");
		v.addElement("Bhargavi");
		System.out.println("Vector Size  " +v.size());
		System.out.println("Capacity  " +v.capacity());
		v.addElement("Mohammad");
		System.out.println("Vector Size  " +v.size());
		System.out.println("Capacity  " +v.capacity());
		v.addElement("Vishal");
		System.out.println("Vector Size  " +v.size());
		System.out.println("Capacity  " +v.capacity());
		
		System.out.println("Elements of Array Are  ");
		for (Object object : v) {
			System.out.println(object);
		}
	}
}
