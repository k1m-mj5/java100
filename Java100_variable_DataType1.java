public class Java100_variable_DataType1 {
	public static void main(String[] args) {
		
		int a;
		int b; int c=90;
		double d;
		char e;
		
		a=10;
		b=20;
		d=10;
		e='A';
		
		System.out.println(a); // 10
		System.out.println(b); // 20
		System.out.println(c); // 90
		System.out.println(d); // 10.0
		System.out.println(e); // A
		
		int w;
		int x,y,z;
		x=900;
		y=900;
		z=900;
		System.out.println(x+"-"+y+"-"+z);
		
		int x1=300,y1=400,z1=500;
		System.out.println(x1+"-"+y1+"-"+z1);
		
		// String str1, str2, str3 = "korea";
		// System.out.println(str3);
		
		String str1,str2,str3;
		str1=str2=str3="korea";
		System.out.println(str1+"-"+str2+"-"+str3);
		
		int i,j,k;
		i=j=k=100;
		System.out.println(i+"-"+j+"-"+k);
		
	}
}