import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample2 {
	public static void main(String[] args) {
		Map names = new HashMap();
		names.put("Raj","Kishore");
		names.put("Vishal", "Bharadwaj");
		names.put("Srikar", "Srikar");
		names.put("Nanda", "Kishore");
		Scanner sc = new Scanner(System.in);
		String user, pwd;
		System.out.println("Enter Username and Password ");
		user = sc.next();
		pwd = sc.next();
		String res = (String)names.get(user);
		if (res.equals(pwd)) {
			System.out.println("Correct Credentials...");
		} else {
			System.out.println("Invalid Credentials...");
		}
	}
}
