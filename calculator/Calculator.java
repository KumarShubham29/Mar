package calculator;
import java.util.Scanner;

public class Calculator {
	private static Scanner sc;
	public static int add(int a,int b) {
		return a+b;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
	public static int mult(int a,int b) {
		return a*b;
	}
	public static float div(int a,int b) {
		float a1=a,b1=b;
		return a1/b1;
	}
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.println("number input");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("choose the operator(+,-,*,/)");
		char ch=sc.next().charAt(0);
		float result=0;
		switch(ch) {
		case '+':
			result=add(a,b);
			break;
		case '-':
			result=sub(a,b);
			break;
		case '*':
			result=mult(a,b);
			break;
		case '/':
			result=div(a,b);
			break;
		default:
			System.out.println("Error! Choose correct operator");
		}
		// TODO Auto-generated method stub
		System.out.printf("%d %c %d=%.2f",a,ch,b,result);
	}
}
