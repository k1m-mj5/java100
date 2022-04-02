public class Java101_javapg02_CommandInputTest {
	public static void main(String args[]){
		/* System.out.println(args[0]);
		int n = Integer.parseInt(args[1]);
		System.out.println(n);
		*/
		
		int[] arrayOfInts = {32, 87, 3, 589, 12, 1076, 2000, 8};
		for (int element : arrayOfInts) {
			System.out.print(element+" "); 	// 32 87 3 589 12 1076 2000 8
		}
		System.out.println();
	}
}