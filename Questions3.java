import java.util.*;
class Questions3{
	static Scanner sc = new Scanner(System.in);
	//1) Prime or not.
	static boolean primenum(int num){
		boolean isprime=true;
		for (int i=2;i<=num/i;i++){
			if (num%i==0) isprime=false;
			break;
		}
		String k = isprime?" is a Prime.":" is not a Prime.";
		//System.out.println(num+k);
		return isprime;
	}
	//2) sums of even and odd digits
	static void sumofdigits(){
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int evensum=0,oddsum=0;
		int i,j;
		for(i = num,j=1;i>0;j++){
			int rem = i%10;
			i = (i-rem)/10;
			if (j%2==0) evensum += rem;
			else oddsum += rem;
			
		}
		System.out.println("Sum of even digits: "+ evensum + "\nSum of odd digits: " + oddsum);
	}
	//3) tringle pattern
	static void pattern1(){
		int k =4,l=4;
		for(int i=0;i<5;i++){
			for(int j=0;j<9;j++){
				if (j>=k && j<=l) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
			k--;l++;
		}
	}
	//4) a pattern with jump statements
	static void pattern2(){
		for(int i=1;i<=5;i++){
			if (i!=3) System.out.println(i +"  " + (6-i));
			else continue;
		}
	}
	//5) pattern "1112\n3222\n3334....."
	static void pattern3(){
		int i,j,k=1;
		for (i=0;i<3;i++){
			for (j=0;j<4;j++){
				if (i%2==0){
					if (j==3) System.out.print(k+1);
					else System.out.print(k);
				}
				else {if (j==0) System.out.print(k+1);
				else System.out.print(k);}
			}
			System.out.println();
			k++;
		}
		//System.out.println("1112\n3222\n3334");
	}
	//6)GCD
	//7)pythogoream triplets
	static void triplets(int limited){
		int limit=1;
		int a=1,b,H2;
		for (;limit<=limited;a++){
			for (b=a+1;b<1000;b++){
				//if (primenum(a)){
					double H1 = Math.sqrt(a*a+b*b);
					H2 = (int) H1;
					if (H2==H1 && limit<=limited) {
						System.out.print(limit+")  ");
						System.out.println(a+", "+b+", "+H2);
						limit++;
					}
				//}
				//else break;
			}
		}
	}
	//8) pattern "1\n11\n101\n1001\n......\n111111upto number of lines"
	static void pattern4(int lines){
		int i,j;
		for (i=0;i<lines;i++){
			for (j=0;j<=i;j++){
				if (j==0 || j==i || i==lines-1) System.out.print(1);
				else System.out.print(0);
			}
			System.out.println();
		}
	}
	//9) dec to bin
	static void convertdecto(int dec,int value){
		String finals = "";
		while (dec>0){
			int rem = dec%value;
			dec = (dec-rem)/value;
			int temp = rem;
			finals = temp+finals;
		}
		System.out.println(finals);
	}
	
	// pattern 5
	static void pattern5(){
		char c = 'A';
		int rows = sc.nextInt(),i,r,j;
		for (i=0;i<rows;i++){
		for (r = rows;r>i+1;r--) System.out.print('A'+" ");
		for (j=0;j<i+1;j++) System.out.print(c+" ");
		c++;
		System.out.println();}
	}
	public static void main(String args[]){
		//primenum(11);
		//sumofdigits();
		//pattern1();
		//pattern2();
		//pattern3();
		//triplets(100);
		//pattern4(5);
		//convertdecto(11,16);
		//pattern5();
	}
}