import java.util.Arrays;
class Program3{
	static void mode(){
		int list[] = {1,1,5,5,3,3,3,3,2,};
	}
	//static void count
	static void median(){
		int list[] = {1, 4, 6, 3,2};
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));
		int i = list.length;
		if (list.length%2==0) {
			double m = list[i/2] + list[i/2-1];
			System.out.println(m/2);
		}
		else System.out.println(list[(i-1)/2]);
	}
	public static void main(String[] args){
		//median();
	}
}