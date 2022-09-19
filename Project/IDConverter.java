

class IDConverter{
	public static void main(String args[]){
		int id = 125;
		int base = 62;
		while (id!=0){
			int rem = id%base;
			id = (id-rem)/base;
			if (rem<=90 && rem>=0) rem = rem+97;
			else rem += 65;
			System.out.println((char) rem);
		}
	}
}