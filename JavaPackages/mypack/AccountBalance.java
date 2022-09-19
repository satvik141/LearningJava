package mypack;
class AccountBalance{
	public static void main(String args[]){
		Balance current[] = new Balance[2];
		current[0] = new Balance("K. J. Fielding", 134.65);
		current[1] = new Balance("Satvik Reddy", 453.58);
		
		for (int i=0;i<current.length;i++) current[i].show();
	}
}