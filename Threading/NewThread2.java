class NewThread2 implements Runnable{
	String name;// name of thread
	Thread t;
	
	NewThread2(String threadname){
		name = threadname;
		t = new Thread(this, name);
		System.out.println("New thread: "+t);
	}
	// This is entry point for thread
	public void run() {
		try {
			for (int i=5;i>0;i--){
				System.out.println(name + ": "+i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e){
			System.out.println(name +"Interrupted");
		}
		System.out.println(name + " exiting.");
	}
}