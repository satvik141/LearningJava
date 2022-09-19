//lex_auth_012906901083594752251
//do not modify the above line

//package stringexercise1;

public class Tester {
	
    public static String removeWhiteSpaces(String str){
		str=String.join("",str.split(" "));
		 return str; 
	}
	
	public static void main(String args[]){
		String str = "Hello   How are you   ";
		str = removeWhiteSpaces(str);
		System.out.println(str);
	}

}
