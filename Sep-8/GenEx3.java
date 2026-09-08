import java.util.ArrayList;
import java.util.List;

public class GenEx3 {
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Raji", 84232.44));
		employList.add(new Employ(2, "Maneesh", 90544.44));
		employList.add(new Employ(3, "Srikar", 81122.44));
		employList.add(new Employ(4, "Rishab", 89077.44));
		employList.add(new Employ(5, "Pranav", 90224.44));
		
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
}
