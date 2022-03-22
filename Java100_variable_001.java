public class Java100_variable_001 {
	public static void main(String[] args) {
		
		int a;
		int b;
		int sum;
		
		a = 3;
		b = 4;
		sum = a+b;
		
		System.out.println(a); // 3
		System.out.println(b); // 4
		System.out.println(sum); // 7
		
		sum = a+b+a;
		System.out.println(sum); // 10
	}
}