import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class GenEx4 {

	public static void main(String[] args) {
		Map<String, String> userData = new Hashtable<String, String>();
		userData.put("Govardhan", "1234");
		userData.put("Srishanth", "Srishanth");
		userData.put("Shruthi", "Shruthi");
		userData.put("Sanjana", "Hani");
		userData.put("Karthik", "4649");
		String user, pwd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName And Password  ");
		user = sc.next();
		pwd = sc.next();
		String res = userData.getOrDefault(user, "Not Found");
		if (pwd.equals(res) ) {
			System.out.println("Correct Credentials...");
		} else {
			System.out.println("Invalid Credentials...");
		}
		
	}
}
