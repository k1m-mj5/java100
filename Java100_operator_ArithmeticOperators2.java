public class Java100_operator_ArithmeticOperators2 {
	public static void main(String[] args) {
		
		int a=60, b=8;
		int rst1; double rst2,rst3,rst4;
		
		rst1 = a/b;
		System.out.println(rst1); 	// 7
		System.out.println((double)rst1); 	// 7.0
		
		rst2 = a/(double)b;
		System.out.println(rst2);	// 7.5
		
		rst3 = 100/ 3;
		System.out.println(rst3); 	// 33.0
		
		rst4 = 100 / 3.0;
		System.out.println(rst4); 	// 33.333333333333336
		System.out.printf("Average: %.1f %n",rst4); 	// Average: 33.3
	}
}