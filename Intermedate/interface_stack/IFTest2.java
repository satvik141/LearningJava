//Implement a "growable" stack.
package interface_stack;
class DynStack implements IntStack{
	private int stck[];
	private int tos;
	
	// alocate and initialize stack
	DynStack(int size){
		stck = new int[size];
		tos =-1;
	}
	// Push an item onto the stack
	public void push(int item){
		//if stack is full, allocate a larger stack
		if (tos==stck.length-1) {
			int temp[] = new int[stck.length*2]; //double size
			for (int i=0;i<stck.length; i++) temp[i]=stck[i];
			stck = temp;
		}
			stck[++tos]=item;
		
	}
	//Pop an item from the stack
	public int pop(){
		if (tos<0){
			System.out.println("Stack underflow.");
			return 0 ;
		}
		else return stck[tos--];
	}
	public void clear(){
		System.out.println("clear() is implemented.");
	}
}

class IFTest2{
	public static void main(String args[]){
		DynStack mystack1=new DynStack(5);
		DynStack mystack2=new DynStack(8);
		
		//these loops cause each stack to growable
		for(int i=0;i<12;i++) mystack1.push(i);
		for(int i=0;i<20;i++) mystack2.push(i);
		
		System.out.println("Stack in mystack1: ");
		for(int i=0;i<12;i++) System.out.println(mystack1.pop());
		System.out.println("Stack in mystack2: ");
		for(int i=0;i<20;i++) System.out.println(mystack2.pop());
		mystack1.clear();
	}
}
