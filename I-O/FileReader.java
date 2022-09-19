import java.io.*;
import java.util.*;

class FileReader{
	public static void main(String args[]) throws FileNotFoundException, IOException{
		int i;
		int x=0;
		FileInputStream fin;
		if (args.length != 1) {
			System.out.println("Usage: FileReader <filename>");
			return;
		}
		fin = new FileInputStream(args[0]);
		do {
			i= fin.read();
			if (i!=-1) System.out.print((char) i);
			if ((char) i=='{') x++;
			else if ((char) i=='}') x--;
		} while (i != -1);
		System.out.println(x);
		if (x>0) System.out.println("Error");
		else System.out.println("Success");
		fin.close();
}
}