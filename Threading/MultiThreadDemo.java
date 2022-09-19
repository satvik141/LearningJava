class MultiThreadDemo{
	public static void main(String args[]){
		NewThread2 nt1=new NewThread2("One");
		NewThread2 nt2=new NewThread2("Two");
		NewThread2 nt3=new NewThread2("Three");
		// Start the threads.
		nt1.t.start();
		nt2.t.start();
		nt3.t.start();
		try {
			// wait for other threads to end
			Thread.sleep(6000);
		}catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Exiting Main thread.");
	}
}