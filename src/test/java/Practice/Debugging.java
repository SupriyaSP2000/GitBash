package Practice;

public class Debugging {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		System.out.println(a);
		System.out.println(b);
		
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
	}
}
