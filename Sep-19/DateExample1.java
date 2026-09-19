import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateExample1 {

	public static void convert(String str) throws ParseException {
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(str);
		System.out.println(date);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Date (yyyy-MM-dd)  ");
		String strDate = sc.next();
		DateExample1 ex = new DateExample1();
		try {
			ex.convert(strDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
