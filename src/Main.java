import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//intSample();
		
		//longSample();
		//charSample();
		//doubleSample();
		//booleanSample();
		//arraySample();
		//stringSample();
		arrayListSample();

		
	}
	
	private static void arrayListSample() {
		// TODO Auto-generated method stub
		ArrayList<Object> oAl = new ArrayList<>();
		oAl.add("abc");
		oAl.add(34);  // 34 is not int, but Integer
		oAl.add(3.7); // 3.7 is not double, but Double
		oAl.add(true); // true is not boolean, but Boolean
		
		System.out.println(oAl);
		
		ArrayList<Integer> iAl = new ArrayList<>();
		iAl.add(3);
		iAl.add(12);
		iAl.add(7);
		int a = 5;
		iAl.add(a);
		System.out.println(iAl);
		
		ArrayList<Double> dAl = new ArrayList<>();
		dAl.add(3.7);
		dAl.add(1.2);
		dAl.add(4.5);
		dAl.add(0.7);
		dAl.add(7.0);
		System.out.println(dAl);
		
		for (int i=0;i<dAl.size();i++) {
			System.out.print(dAl.get(i)+" ");
		}
		System.out.println();
		
		dAl.set(1, 0.0);
		System.out.println(dAl);
		
		dAl.add(1, 100.0);  // insert
		System.out.println(dAl);
		
		dAl.remove(100.0);
		System.out.println(dAl);
		
		iAl.remove(3);
		System.out.println(iAl);
		
		iAl.add(5);
		Integer b = 3;
		iAl.remove(b);
		System.out.println(iAl);
		
		ArrayList<Double> dAl2 = new ArrayList<>();
		dAl2.add(3.3);
		dAl2.add(4.4);
		dAl2.add(5.5);
		
		System.out.println(dAl);
		System.out.println(dAl2);
		dAl.addAll(dAl2);
		System.out.println(dAl);
		
		
	}

	private static void stringSample() {
		// TODO Auto-generated method stub
		String s = "adkj;fjsad;fjajfl;kasjfs;afjsa";
		System.out.println(s.length());
		
		// String addition : concat string
		s += "adfsdafsadf;sdafj;";
		System.out.println(s);
		
		// get character of a string by its index.
		for (int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			System.out.print(c+" ");
		}
		System.out.println();
		
		// substring
		String s2 = "Students";
		String substr = s2.substring(3);
		System.out.println(substr);
		substr = s2.substring(2, 5);
		System.out.println(substr);
		
		// split
		String[] substrs = s.split(";");
		for (int i=0;i<substrs.length;i++) {
			System.out.print(substrs[i] + "||||");
		}
		System.out.println();
		
		// parse types
		String s3 = "34 56 78";
		substrs = s3.split(" ");
		for (int i=0;i<substrs.length;i++) {
			System.out.println(substrs[i]);
			int a = Integer.parseInt(substrs[i]);
			System.out.println(a);
		}
		
		s3 = "32.3 0.32 78.7";
		substrs = s3.split(" ");
		for (int i=0;i<substrs.length;i++) {
			System.out.println(substrs[i]);
			double d = Double.parseDouble(substrs[i]);
			System.out.println(d);
		}
		
		s3 = "true false False TRUE";
		substrs = s3.split(" ");
		for (int i=0;i<substrs.length;i++) {
			System.out.println(substrs[i]);
			boolean d = Boolean.parseBoolean(substrs[i]);
			System.out.println(d);
		}
		
		System.out.println(s);
		substrs = s.split("fj");
		for (int i=0;i<substrs.length;i++) {
			System.out.print(substrs[i] + "||||");
		}
		System.out.println();
		
		// find substring
		int index = s.indexOf("fj");
		System.out.println(index);
		
		index = s.lastIndexOf("fj");
		System.out.println(index);
		
		index = s.indexOf("student");
		System.out.println(index);
		
		index = s.indexOf("fj");
		while (index>=0) {
			System.out.print(index+",");
			index = s.indexOf("fj", index+2);
		}
		System.out.println();
		
		index=0;
		for (int i=0;i<2;i++) {
			index = s.indexOf("fj", index);
			index+=2;
		}
		System.out.print(index-2);
		
	}

	private static void arraySample() {
		// TODO Auto-generated method stub
		int[] iAr = new int[10];
		for (int i=0; i<iAr.length; i++) { // for (init;condition to loop;update each)
			iAr[i] = i*5;
		}
		System.out.println(iAr);
		for (int i=0; i<iAr.length;i++) {
			System.out.print(iAr[i]+" ");
		}
		System.out.println();
		char[] cAr = {'h','c','f','a','b'};
		System.out.println(cAr.length);
		for (int i=0;i<cAr.length;i++) {
			System.out.print(cAr[i]+" ");
		}
		System.out.println();
		
		String[] sAr = {"adsfasd", "dafa", "gfasdfas", "edfdfd"};
		for (int i=0;i<sAr.length;i++) {
			System.out.print(sAr[i]+" ");
		}
		System.out.println();
		
		Arrays.sort(cAr);
		for (int i=0;i<cAr.length;i++) {
			System.out.print(cAr[i]+" ");
		}
		System.out.println();
		
		Arrays.sort(sAr);
		for (int i=0;i<sAr.length;i++) {
			System.out.print(sAr[i]+" ");
		}
		System.out.println();
		
		Arrays.sort(sAr, Collections.reverseOrder());
		for (int i=0;i<sAr.length;i++) {
			System.out.print(sAr[i]+" ");
		}
		System.out.println();
		
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
