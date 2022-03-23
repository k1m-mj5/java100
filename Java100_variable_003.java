public class Java100_variable_003 {
	public static void main(String[] args) {
		
		//byte, short, int, long, char
		System.out.println(Byte.BYTES);  // byte -> 1
		System.out.println(Byte.SIZE);  // bit -> 8
		System.out.println(Short.BYTES+Short.SIZE); // 2+16 -> 18
		System.out.println(Short.MIN_VALUE+"~"+Short.MAX_VALUE); // -32768~32767
		System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE); // -2147483648~2147483647
		System.out.println(Long.MIN_VALUE+"~"+Long.MAX_VALUE); // -9223372036854775808~9223372036854775807
		System.out.println((int)Character.MIN_VALUE+"~"+(int)Character.MAX_VALUE); // 0~65535
		
	}
}