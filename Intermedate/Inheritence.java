class A{
	int i;
	private int j;
	void setj(int x){
		j =x;
	}
	int getj(){
		return j;
	}
}
class B extends A{
	int k;
	void sum(){
		//k = i+j; j can't be accesed anyway
	}
}
class Inheritence{
	public static void main(String args[]){
		System.out.println("'This is inheritence.'");
		A Aob = new A();
		B Bob = new B();
		Aob.i=1;
		System.out.println("i from A through A: "+Aob.i);
		Bob.i=2;
		System.out.println("i from A through B: "+Bob.i);
		Aob.setj(9);
		//Bob.sum();
		//system.out.println(Bob.k);
		System.out.println("private j from A through it's methods: "+Aob.getj());
		
	}
}