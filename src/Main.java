import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		//System.out.print("Please input your name:");
		//String name = sc.nextLine();
		
		String fullname = "";
		for (int i=0;i<args.length;i++) {
			fullname += args[i] + " ";
		}
		System.out.println("Hellow World," + fullname + "!");
	}

}
