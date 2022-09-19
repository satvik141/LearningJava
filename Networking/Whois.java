import java.net.*;
import java.io.*;

class Whois {
	public static void main(String args[]) throws Exception {
		int c;
		
		//Create a scoket connected to internic.net port 43.
		
		try (Socket s = new Socket("whois.godaddy.com",43)){
		
		// Obtatin input and output streams
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();
		
		//Construct a requst string.
		
		String str = (args.length == 0?"OraclePressBooks.com":args[0]) +"\n";
		// Convert to bytes.
		byte buf[] = str.getBytes();
		
		// Send request.
		out.write(buf);
		
		// Read and display response.
		while ((c=in.read()) != -1){
			System.out.print((char) c);
		}
		s.close();
		}
	}
}