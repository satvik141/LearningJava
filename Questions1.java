import java.util.*;
class Questions1{
	
	static Scanner sc = new Scanner(System.in);
	
	//1) Write a program to check whether a number is even or odd.
	static void OddOrEven(int num){
		System.out.println("1Q)");
		if (num%2==0) System.out.println(num +" is Even.");
		else System.out.println(num+" is odd.");
	}
	//2) Write a program to check whether a person is eligible for voting or not.
	static void VoteEligibility(String name, int age){
		System.out.println("2Q)");
		if (age>=0){
			if (age>=18) System.out.println(name +" is eligible for voting.");
			else System.out.println(name +" is not eligible for voting.");
		}
		else System.out.println("Error: Age should be possitive.");
	}
	//3) WAP to accept Cost {rice from user and ask whether the user is a student or not. 
	//If the user is student and cost price is greater than 500, give discount of 10%
	//Else discount will be 5%.
	//if user is not student and cost price is greater than 500 the give discount of 8%,Else discount will ve 2%.
	static void userDiscount(){
		System.out.println("3Q)");
		System.out.print("Cost-Price: ");
		int price = sc.nextInt();
		System.out.print("Is student(true or false): ");
		boolean student = sc.nextBoolean();
		float discount;
		String user;
		if (student) {
			user = "Student";
			if (price >500) discount=10 ;
			else discount=5;
		}
		else {
			user = "Non-Student";
			if (price >500) discount = 8 ;
			else discount=2;
		}
		System.out.println("User: "+user);
		System.out.println("Discount: "+discount+"%");
		System.out.println("Final Price: "+ (price - (discount*price/100)));
		
	}
	//4) WAP to check whether Number is positive or negative or zero.
	static void posORneg(double num){
		System.out.println("4Q)");
		if (num<0) System.out.println(num+" is Negitive.");
		else if (num>0) System.out.println(num+" is Positive.");
		else System.out.println(num+" is Zero");
	}
	//5) WAP a program to accept Percentage from user and check the GRADE;
	static void grade(){
		System.out.println("5Q)");
		System.out.print("Enter Percentage(%): ");
		double percentage = sc.nextDouble();
		if (percentage<=100 && percentage >=0){
			if (percentage>70) System.out.println("Grade A.");
			else if (percentage <=70 && percentage >60) System.out.println("Grade B+.");
			else if (percentage <=60 && percentage >45) System.out.println("Grade B.");
			else if (percentage <=45 && percentage >35) System.out.println("Grade c.");
			else System.out.println("Fail.");
		}
		else System.out.println("percentage should be between 0-100.");
	
	}
	//6) WAP to Accept three numbers from user and find out largest number among three 
	//And also find out whether rhat three numbers are  equal or not.(else if ladder)
	static void greatestof3(){
		System.out.print("6Q)");
		System.out.print("First number: ");
		double a = sc.nextDouble();
		System.out.print("Second number: ");
		double b = sc.nextDouble();
		System.out.print("Third number: ");
		double c = sc.nextDouble();
		if (a==b && b==c) System.out.println("All are equal");
		else {
			if ((a<=b && b<=c)||(b<=a && a<=c)) System.out.println(c);
			else if ((a<=c && c<=b)||(c<=a && c<=b)) System.out.println(b);
			else if ((c<=b && b<=a)||(b<=c && c<=a)) System.out.println(a);
		}
	}
	public static void main(String args[]){
		//OddOrEven(5);
		//VoteEligibility("Satvik",19);
		//userDiscount();
		//posORneg(76);
		//grade();
		//greatestof3();
	}
}