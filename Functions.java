package Intermedate;
class GCD{
	int gcd(int a ,int b){
		int fin=1;
		for (int i=2;i<=a;i++){
			int temp =i;
			if (a%i==0 && b%i==0){
				a /= i;
				b /= i;
				fin *=i;
				i=temp;
			}
		}
		return fin;
	}
	void gcdf(int ... lst){
		int k;
		System.out.print("GCD of "+lst[0]);
		for (k=1 ;k<lst.length;k++){
			lst[0] = gcd(lst[0],lst[k]);
			System.out.print(", "+lst[k]);
		}
		System.out.println(" is "+lst[0]);
	}
	int lcm(int a,int b){
		int lcm = a*b/gcd(a,b);
		return lcm;
	}
	
	void lcml(int a,int b){
		long lcm =(long) a*b/gcd(a,b);
		System.out.println(lcm);
	}
	void lcmf(int ... lst){
		int k;
		System.out.print("LCM of "+lst[0]);
		for (k=1 ;k<lst.length;k++){
			System.out.print(", "+lst[k]);
			lst[0] = lcm(lst[0],lst[k]);	
		}
		System.out.println(" is "+lst[0]);
	}
}
class Factors{
	void primefactors(int ... num){
		for (int a:num){
			System.out.print("Prime Factors of "+a+" are ");
			for (int i=2;i<=a;i++){
				if (a%i==0){
					a /= i;
					System.out.print(i+" ");
					i--;
				}
			}
			System.out.println();
		}
	}
	void factors(int ... num){
		for (int a:num){
			System.out.print("Factors of "+a+" are: ");
			for (int i=1;i<=a;i++){
				if (a%i==0){
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}
	}
}
class Functions{
	public static void main(String[] args){
		GCD gcd = new GCD();
		Factors factors = new Factors();
		//factors.primefactors(4,10,6);
		//factors.factors(4,10,6);
		//gcd.gcdf(4,10,6);
		gcd.lcml(337836, 7057);
	}
}