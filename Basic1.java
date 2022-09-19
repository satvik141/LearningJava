import java.util.Random;
class Basic1{
	public static void main(String[] args){
		Random rand =new Random();
		int j=0;
		while (j<3) {
			int i;
			do{
				i=rand.nextInt(0,10);
			}while(j==0&&i==0);
			j++;
			System.out.println(i);
		}
	}
}