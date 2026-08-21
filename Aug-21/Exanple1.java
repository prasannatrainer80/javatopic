import java.util.ArrayList;
import java.util.List;

public class Exanple1 {
	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Anjana");
		names.add("Vinay");
		names.add("Sagar");
		names.add("Sireesha");
		names.add("Anil");
		
		System.out.println("Names are ");
		for (Object object : names) {
			System.out.println(object);
		}
		
		names.add(3,"Chatrapathi");
		System.out.println("Names after Insert  ");
		for (Object object : names) {
			System.out.println(object);
		}
		
		names.remove(2);
		System.out.println("Names after Remove Operation");
		for (Object object : names) {
			System.out.println(object);
		}
	};
	
}
