import java.awt.Point;

class Rectangle {
	public int width = 0;
	public int height = 0;
	public Point origin;
	
	public Rectangle( ) {
		origin = new Point(0, 0);
	}
	
	public Rectangle(Point p, int w, int h) {
		origin = p;
		width = w;
		height = h;
	}
	
	public class Java101_javapg04_Test {
		public static void maind(String args[]) {
			Point originOne = new Point(23, 94);
			Rectangle rectOne = 
				new Rectangle(originOne, 100, 200);
		}
	}
}