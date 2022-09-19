import java.util.*;
class Passvalidate{
	static Scanner sc = new Scanner(System.in);
	static void validation(){
		String password = sc.nextLine();
		boolean special=false,number=false,capital=false,small=false;
		for (int i=0;i<password.length();i++){
			int c = (int) password.charAt(i);
			//System.out.println(c);
			//33-47,58-64,91-96,123-126(special)
			if ((c>=33 && c<=47) || (c>=58 && c<=64) || (c>=91 && c<=96) || (c>=123 && c<=126)) special=true;
			else if (c>=48 && c<=57) number = true; 
			//48-57(numbers)
			//65-90(capital)
			else if (c>=65 && c<=90) capital=true;
			//97-122(small)
			else if (c>=97 && c<=122) small = true;
			else System.out.println("charecter \""+(char) c + "\" is not allowed");
		}
		if (special&&number&&capital&&small&&(password.length()==8)) System.out.println("Password is valid.") ;
		else System.out.println("Password is not valid.");
	}
	public static void main(String args[]){
		validation();
	}
}