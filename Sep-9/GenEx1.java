
class Data<T> {
	
	public void swap(T a,T b) {
		T t;
		t = a;
		a = b;
		b = t;
		System.out.println("A value  " +a+ " B value " +b);
	}
}

public class GenEx1 {
	public static void main(String[] args) {
		Data data = new Data();
		int a = 5, b = 7;
		String s1="Manideep",s2="Srikanth";
		boolean b1=true, b2=false;
		data.swap(a, b);
		data.swap(s1, s2);
		data.swap(b1, b2);
	}
}
