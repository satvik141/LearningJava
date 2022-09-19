import java.io.*;
class BRRead{
	public static void main(String args[]) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str[] = new String[10];
		for (int i =0;i<10;i++){
			str[i] = br.readLine();
			if (str[i].equals("")) break;
		}
		for (int i =0;i<10;i++){
			if (str[i].equals("")) break;
			System.out.println(str[i]);
		}
		int b;
		b = 'A';
		System.out.write(b);
		System.out.write('\n');
	}
}