import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class GenEx3 {
	public static void main(String[] args) {
		Map<Integer, String> mp1 = new Hashtable<Integer, String>();
		mp1.put(1, "Harthika");
		mp1.put(2, "Nagaraju");
		mp1.put(3, "Vinay");
		mp1.put(4, "RajyaLaxmi");
		mp1.put(5, "Praveen");
		int key;
		String result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key  ");
		key=sc.nextInt();
		result = mp1.getOrDefault(key, "Not Found");
		System.out.println(result);
	}
}
