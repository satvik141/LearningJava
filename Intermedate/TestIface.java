interface Callback{
	void callback (int param);
}
class Client implements Callback {
	// Impkement Callback's interface
	public void callback(int p) {
		System.out.println("callback called with "+p);
	}
	void nonIfaceMeth(){
		System.out.println("Classes that implement interfaces "+ "may also define other members, too.");
	}
}
class AnotherClient implements Callback{
	// Implement Callback's interface
	public void callback(int p) {
		System.out.println("Another version of callback");
		System.out.println("p squared is "+(p*p));
	}
}
class Nested{
	public interface NestedIF{
		boolean isNotNegative(int x);
	}
}
class Nest implements Nested.NestedIF{
	public boolean isNotNegative(int x){
		return x<0 ? false:true;
	}
}
class TestIface {
	public static void main(String args[]){
		Callback c = new Client();
		AnotherClient ob = new AnotherClient();
		//Callback in = new Incomplete(); Error
		Nested.NestedIF nif = new Nest();
		//c.nonIfaceMeth(); will get Error
		c.callback(43);
		
		c = ob; // c now refers to AnotherClient object
		c.callback(54);
		
		//Nested
		System.out.println("wirh Nest interface 10 is "+nif.isNotNegative(-10));
	}
}