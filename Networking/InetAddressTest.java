import java.net.*;
import java.util.*;

class InetAddressTest{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		InetAddress Address = InetAddress.getLocalHost();
		System.out.println(Address);
		
		System.out.print("Enter the name of the Site for it address: ");
		String add = sc.nextLine();
		Address = InetAddress.getByName(add);
		System.out.println(Address);
		
		InetAddress SW[] = InetAddress.getAllByName(add);
		for (int i=0;i<SW.length;i++) System.out.println(SW[i]);
		
		
	}
}