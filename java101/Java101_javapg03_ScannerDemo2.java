import java.util.Scanner;

public class Java101_javapg03_ScannerDemo2 {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			while(sc.hasNextInt()) {
				System.out.println(sc.nextInt());
			}
		}
}