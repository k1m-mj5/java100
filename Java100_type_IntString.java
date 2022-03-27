public class  Java100_type_IntString {
	public static void main(String[] args) {
		
		int a = 12345;
		String str = "12345";
		System.out.println(str.length()); // 5
		
		String stra = String.valueOf(a);
		System.out.println(stra); 				// 12345
		System.out.println(stra.length()); // 5
		
		System.out.println(12345+1); 	// 12346
		System.out.println(str+1);			// 123451
		
		int b = Integer.valueOf(str);
		System.out.println(b+1);			//12346
	}
}