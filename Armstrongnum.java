class Armstrongnum{
	public static void main(String args[]){
		//ex 371 (number = sum of cubes of it's digits
		int i= 371,temp;
		temp = i;
		int j=0,rem;
		String k;
		while (i!=0){
			rem = i%10;
			j+=rem*rem*rem;
			i = (i-rem)/10;
		}
		k = (j==temp)?"Yes":"No";
		System.out.println(k);
	}
}