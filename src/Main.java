import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//intSample();
		
		//longSample();
		//charSample();
		//doubleSample();
		booleanSample();
		/*arraySample();
		stringSample();
		arrayListSample();*/

		
	}
	
	private static void booleanSample() {
		// TODO Auto-generated method stub
		boolean a, b;
		/*System.out.print("Please input boolean a and b:");
		a = sc.nextBoolean();
		b = sc.nextBoolean();
		System.out.println("a && b="+(a&&b));
		System.out.println("a || b="+(a||b));
		System.out.println("not a="+(!a));*/
		
		a = 4 == 3;
		b = 4 > 3;
		boolean c = 4 < 3;
		boolean d = 4 != 3;
		boolean e = 4 >= 3;
		boolean f = 5 <= 6;
		
		System.out.println(a + "," + b + "," +c +","+d+","+e+","+f);
		
		
	}

	private static void doubleSample() {
		// TODO Auto-generated method stub
		double a, b;
		
		
		System.out.print("Please input double a and b:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		
		a = Math.sqrt(2);
		a = a* a;
		System.out.println(a);
	}

	private static void charSample() {
		// TODO Auto-generated method stub
		char a='A';
		a++; // a=a+1
		int b = a+1;
		System.out.println("a is '" + a + "' and b is "+b );
		
		b = changeCharToNumber('7');
		System.out.println(b);
	}

	private static int changeCharToNumber(char c) {
		// TODO Auto-generated method stub
		return c-'0';
	}

	private static void intSample() {
		// TODO Auto-generated method stub
		int a, b;
		
		System.out.print("Please input int a and b:");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		
	}
	
	private static void longSample() {
		// TODO Auto-generated method stub
		long a, b;
		
		System.out.print("Please input long a and b:");
		a = sc.nextLong();
		b = sc.nextLong();
		
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		
	}

}
