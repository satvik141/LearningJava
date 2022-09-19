class DemoJoin{
	public static void main(String args[]){
		NewThread2 nt1 = new NewThread2("One");
		NewThread2 nt2 = new NewThread2("Two");
		NewThread2 nt3 = new NewThread2("Three");
		
		nt1.t.start();
		nt2.t.start();
		nt3.t.start();
		
		System.out.println("Threads One, Two, Three are alive: "+nt1.t.isAlive()+nt2.t.isAlive()+nt3.t.isAlive());
		// wair for threads to finish
		try {
			System.out.println("Waiting for threads to finish.");
			nt1.t.join();
			nt2.t.join();
			nt3.t.join();
		}
		catch (InterruptedException e){
			System.out.println("Main thread Interrupted.");
		}
		System.out.println("Threads One, Two, Three are alive: "+nt1.t.isAlive()+nt2.t.isAlive()+nt3.t.isAlive());
		
		System.out.println("Main thread exiting.");
	}
}