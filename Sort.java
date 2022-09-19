class Sort{
	static void sort(int stck[], double length){
		boolean sorting = true;
		for (int i=0;i<length;i++){
			for (int j=i+1;j<length;j++){
			if (stck[i]>stck[j]) {
				int temp = stck[i];
				stck[i]=stck[j];
				stck[j]=temp;
			}
			}
			
		}
	}
	public static void main(String args[]){
		System.out.println("Sorting array");
		int numbers[] = {1 ,4 ,6, 8, 2 ,3, 5, 6, 7, 9, 0};
		int stck[] = {1, 4, 2, 7, 3};
		sort(numbers,numbers.length);
		for (int i:numbers){
			System.out.print(i);}
	}
	
}