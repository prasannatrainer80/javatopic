import java.util.ArrayList;
import java.util.List;

public class GenEx2 {
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Mathin");
		names.add("Sathwik");
//		names.add(12);
		names.add("Akshith");
		names.add("Hari");
		names.add("Bala");
		
		System.out.println("Names Are  ");
		for (String s : names) {
			System.out.println(s);
		}
	}
}
