class Dowhile{
	public static void main(String args[]) throws java.io.IOException {
		System.out.println("do-while and Switch case and input");
		char num ;
		do {
			System.out.println("Choose one: ");
			System.out.println("1) Hello");
			System.out.println("2) World");
			System.out.print("Any one choose: ");
			num = (char) System.in.read();
		} while (num == 1 || num == 2 );
		switch (num){
			case '1':
			System.out.println("Hello");
			break;
			case '2':
			System.out.println("World");
			break;
		}
	}
}