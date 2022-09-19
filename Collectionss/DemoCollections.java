import java.util.*;

class DemoCollections{
	static void lists(){
		List list = new ArrayList();
		System.out.println("All types of elements == Objects");
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<5;i++) list.add(i);
		System.out.println("list: "+list);
		System.out.println("Size:"+ list.size());
		list.add(3,"hello");
		System.out.println("Added 'hello' at index 3");
		//list.add(sc.nextLine());
		System.out.println("list: "+list);
		
	}
	static void typedlists(){
		Random rand =new Random();
		List<Integer> list = new ArrayList<>();
		System.out.println("Only for integers");
		for (int i=0;i<5;i++) list.add(rand.nextInt(5));
		System.out.println("list: "+list);
		System.out.println("Sorting the list");
		Collections.sort(list);
		System.out.println(list);
		
	}
	
	public static void main(String args[]){
		lists();
		typedlists();
	}
}