
class Data<T> {
	
	public void swap(T a, T b) {
		T t;
		t = a;
		a = b;
		b = t;
		System.out.println("A  " +a+ " B  " +b);
	}
}

public class GenEx1 {
	public static void main(String[] args) {
		int a = 5, b = 7;
		Data data = new Data();
		data.swap(a, b);
		String s1 = "Anjana", s2="Neha";
		data.swap(s1, s2);
		boolean f1 = true, f2 = false;
		data.swap(f1, f2);
	}
}
