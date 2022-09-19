class Sync{
	public void sync(String name){
		System.out.print("["+name);
		try {
				Thread.sleep(1000);
			}
		catch (InterruptedException e){
			System.out.println("Thread interrupted.");
		}
		System.out.println("]");
	}
	
}
class Ex1Thread implements Runnable{
	String name ;
	Thread t;
	Sync target;
	Ex1Thread(Sync tar,String threadname){
		name = threadname;
		target = tar;
		t = new Thread(this,name);
		System.out.println(t);
	}
	public void run(){
		synchronized(target){ // synchronized block
			target.sync(name);
		}
	}
}
class Ex1{
	public static void main(String args[]){
		Sync target = new Sync();
		Ex1Thread t1 = new Ex1Thread(target,"1");
		Ex1Thread t2 = new Ex1Thread(target,"2");
		Ex1Thread t3 = new Ex1Thread(target,"3");

		t1.t.start();
		t2.t.start();
		t3.t.start();
		
		try {
			t1.t.join();
			t2.t.join();
			t3.t.join();
		}
		catch (InterruptedException e){
			System.out.println("Interrupted.");
		}
		System.out.println("threads ended");
	}
}