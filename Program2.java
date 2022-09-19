import java.util.*;
class Program2{
	static void leapcount(){
		int num1[] = {4, 5, 3, 1};
		int num2[] = {5, 2, 7, 1};
		int year1 = 0, year2=0;
		for (int i=0;i<num1.length;i++) {year1+=num1[i]*(Math.pow(10,num1.length-i-1));
		year2+=num2[i]*(Math.pow(10,num2.length-i-1));}
		double leap=0;
		for (int i=year1;i<=year2;i++){
			if (i%100==0){
				if (i%400==0) leap +=1;
				else continue;
			}
			else if (i%4==0) leap +=1;
		}
		System.out.println("year1: " + year1);
		System.out.println("year2: " + year2);
		System.out.println("leap year count between year1 and year2: "+leap);
	}
	static void gt10s(){
		int num1 = 123;
		int num2 = 432;
		double place10s1 = Math.floor(num1/10)-Math.floor(num1/100)*10;
		double place10s2 = Math.floor(num2/10)-Math.floor(num2/100)*10;
		//System.out.println(place10s1);
		//System.out.println(place10s2);
		System.out.print("greatest number in 10's place: ");
		if (place10s1<place10s2) System.out.println(num2);
		else System.out.println(num1);
	}
	static void empty3gle(){
		int i,j;
		for (i=0;i<6;i++){
			for (j=0;j<7;j++){
				if (i+j<=3 || j-i>=3 || i>=4) System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
	static void oppcalc(){
		double num1=2,num2=3;
		char opra = '+';
		System.out.print(num1 +" "+ opra +" "+ num2 + " = ");
		switch (opra){
			case '*' : System.out.println(num1/num2);
			break;
			case '/' : System.out.println(num1*num2);
			break;
			case '+' : System.out.println(num1-num2);
			break;
			case '-' : System.out.println(num1+num2);
			break;
			default: System.out.println("Give correct operator");
			
		}
	}
	static void norepeat(int ... list){
		System.out.println("'... list' similar to 'list[]' only in args but u can use 0 or more args not as list and must be last and also only one");
		Arrays.sort(list);
		int k=0;
		for (int i=0;i<list.length-1;i++){
			int j=i+1;
			if (list[i]!=list[j])  k++;
		}
		int list1[] = new int[k+1];
		k=0;
		for (int i=0;i<list.length-1;i++){
			int j=i+1;
			if (list[i]!=list[j]) {list1[k]=list[i]; k++;}
		}
		list1[k] = list[list.length-1];
		System.out.println(Arrays.toString(list1));
		
	}
	//static void 
	public static void main(String args[]){
		//leapcount();
		//gt10s();
		//empty3gle();
		//oppcalc();
		//norepeat(5,4,3,5,3,3,5,5);
		System.out.println(String.format("%.2f",4.3523));
	}
}