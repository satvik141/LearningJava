import java.util.*;
class NumToChar{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a[] = {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
		for (int i=0;i<4;i++) System.out.println(a[i]+"-"+(char) a[i]) ;
	}
}