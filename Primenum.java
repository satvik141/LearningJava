class Primenum{
	public static void main(String args[]){
		int sum=0;
		System.out.println("Prime numbers");
		for (int num = 0;num<=100;num++){
			boolean isprime=true;
			if (num<2) isprime = false;
			for (int i=2; i<=num/i; i++) {
				if ((num%i)==0){
					isprime = false;
					break;
				}
			}
			if (isprime) sum+=num;
		}
		System.out.println(sum);
	}
}