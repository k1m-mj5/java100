public class Java100_variable_DataType4 {
	public static void main(String[] args) {
		byte b = 127;
		short s = 32767;
		int i = 2100000000;
		long l = 7000000000L;
		float f = 9.8F;
		double d = 3.14;
		char c = 'A';
		boolean bl = false;
		
		System.out.println("Hello");
		
		// %d, %f, %c, %s, %b, %n(enter)
		System.out.printf("%d,%d,%d,%d,%n",b,s,i,l); // 127,32767,2100000000,7000000000
		System.out.printf("%.1f, %.2f, %c, %b",f,d,c,bl);
		
		//%o 8, %x 16
		System.out.println();
		System.out.printf("10->%d, 8->%o, 16->%x",b,b,b);
		System.out.println();
	}
}