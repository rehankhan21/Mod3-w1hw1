package w1hw1;
import java.util.Scanner;

public class Calculator {
	
//	int a, b, input;
//	
//	Scanner scan = new Scanner(System.in);
	
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int subtract(int a, int b) {
		return a - b;
	}
	
	private static int multiply(int a, int b) {
		//return a * b;
		
		try {
			return a * b;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}
	
	private static float multiply(float a, float b) {
		//return a * b;
		
		try {
			return a * b;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}
	
	static void divide(int a, int b) {
		int div = a/b;
		int remain = a%b;
		System.out.println(a + " / " + b + " = " + div + ", remainder of " + remain);
	}
	
	public static int exit() {
		return 0;
	}

	public static void main(String[] args) {
		
		int a, b, input;
		
		float c,d;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("OPTIONS: "
				+ " 1.Add  2.Subtract 3.Multiply 4.Divide 5.Exit");
		input = scan.nextInt();
		
		switch(input) {
		case 1:
			System.out.println("Enter first number to Add: ");
			a = scan.nextInt();
			System.out.println("Enter second number to Add: ");
			b = scan.nextInt();
			System.out.println(a + " + " + b + " = " + add(a,b) );
			break;
		case 2:
			System.out.println("Enter first number to subtract: ");
			a= scan.nextInt();
			System.out.println("Enter second number to subtract: ");
			b = scan.nextInt();
			System.out.println(a + " - " + b + " = " + subtract(a,b));
			break;
		case 3:
			System.out.println("Enter first number to multiply: ");
			c = scan.nextFloat();
			System.out.println("Enter second number to multiply: ");
			d = scan.nextFloat();
			System.out.println(c + " * " + d + " = " + multiply(c,d));
			break;
		case 4:
			System.out.println("Enter first number to divide: ");
			a = scan.nextInt();
			System.out.println("Enter second number to divide: ");
			b = scan.nextInt();
//			System.out.println(a + " / " + b + " = " + divide(a,b));
			divide(a, b);
			break;
		case 5:
			exit();
			break;
		default: System.out.println("Invalid Entry, Try Again");
		}

	}

}
