import java.net.*;

class URLDemo {
	public static void main(String args[]) throws Exception{
		URL hp = new URL("http://www.learnbharathuniversity.com/index.html");
		URlConnection hpcon = hp.openConnection();
		
		System.out.println(hp.getProtocol());
		System.out.println(hp.getPort());
		
		System.out.println(hp.getHost());
		System.out.println(hp.getFile());
		System.out.println(hp.toExternalForm());
		
		
	}
}