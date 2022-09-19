import java.util.*;
class Questions2{
	static Scanner sc = new Scanner(System.in);
	static void square_cube(){
		System.out.print("Enter a number: ");
		double num = sc.nextDouble();
		System.out.println("Square of "+num+" is "+(num*num));
		System.out.println("cube of "+num+" is "+(num*num*num));
	}
	static void leap_year(){
		System.out.print("Enter an year: ");
		int year = sc.nextInt();
		boolean isleap;
		if (year%4==0){
			isleap = true;
			if (year%100==0){
				if (year%400==0) isleap = true;
				else isleap = false;
			}
		}
		else isleap =false;
		if (isleap) System.out.println(year + " is a leap year");
		else System.out.println(year + " is not a leap year");
	}
	static void menu(){
		System.out.println("Choice-1: Accept number and find out square and cube.");
		System.out.println("Choice-2: Check whether the given year is LEAP or not.");
		System.out.print("Choose any option(1 or 2): ");
		int choice = sc.nextInt();
		switch (choice){
			case 1: square_cube();
			break;
			case 2: leap_year();
			break;
			default: System.out.println("Try again and Choose correct option.");
		}
	}
	static void operator(){
		double num1=1, num2=2;
		System.out.print("Enter Arithmetic operator: ");
		char oper = sc.next().charAt(0);
		switch (oper){
			case '+': System.out.println(num1+num2);
			break;
			case '-': System.out.println(num1-num2);
			break;
			case '*': System.out.println(num1*num2);
			break ;
			case '/': System.out.println(num1/num2);
			break;
			default: {
				System.out.println("'+' is for Addition.");
				System.out.println("'-' is for Subtraction.");
			}
		}
	}
	public static void main(String args[]){
		//menu();
		operator();
	}
}