import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapExample1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map data = new Hashtable();
		data.put(1, "Kishore");
		data.put(2, "Vaishnavi");
		data.put(3, "Krishna");
		data.put(4, "Nithin");
		data.put(5, "Thrisha");
		int key;
		System.out.println("Enter Key  ");
		key = sc.nextInt();
		String res = (String)data.get(key);
		System.out.println(res);
	}
}
