import java.util.Scanner;

public class Calculation {

	public void calc(int a, int b) throws NegativeException, NumberZeroException {
		if (a < 0 || b < 0) {
			throw new NegativeException("Negative Nos Not Allowed...");
		} else if (a == 0 || b == 0) {
			throw new NumberZeroException("Zero is Invalid Value...");
		}
		int c = a + b;
		System.out.println("Sum is  " +c);
	}
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers  ");
		a = sc.nextInt();
		b = sc.nextInt();
		Calculation calc = new Calculation();
		try {
			calc.calc(a, b);
		} catch (NegativeException | NumberZeroException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
	}
}
