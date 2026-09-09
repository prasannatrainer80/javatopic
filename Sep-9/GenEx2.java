import java.util.ArrayList;
import java.util.List;

public class GenEx2 {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("Manideep");
		names.add("Vinay");
		names.add("Govardhan");
		names.add("Nagaraju");
		names.add("Shivaprasad");
		
		System.out.println("Names Are  ");
		for (String s : names) {
			System.out.println(s);
		}
		
	}
}
