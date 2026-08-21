import java.util.SortedSet;
import java.util.TreeSet;

public class Example5 {
	public static void main(String[] args) {
		SortedSet names = new TreeSet();
		names.add("Sanjana");
		names.add("Sagar");
		names.add("Nishitha");
		names.add("Hemanth");
		names.add("Anil");
		System.out.println("Sorted Data");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
