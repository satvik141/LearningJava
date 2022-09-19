class Factorial{
	int factorial(int n){
		if (n==1) return 1;
		else {
			return factorial(n-1)*n;
		}
	}
	public static void main(String args[]){
		Factorial f = new Factorial();
		System.out.println(f.factorial(10));
	}
}