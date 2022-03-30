public class Java100_operator_LogicalOperators {
	public static void main(String[] args) {
		
		// [!] &&, || , !
		// &&(and)  ||(or)  !(not)
		// A&&B  -> A and B
		// A||B -> A or B
		// !A
		
		int a=10, b=20, c=30;
		
		boolean rst1 = a<b && c>b;
		System.out.println(rst1); 	// true
		
		boolean rst2 = a<b || c<b;
		System.out.println(rst2); 	// true
		
		boolean rst3 = a>c|| b!=c;
		System.out.println(rst3); 	// true
		
		boolean rst4 =! rst3;
		System.out.println(rst4); 	// false
		System.out.println(!rst4); 	// true
	}
}