class BasicArray{
	public static void main(String[] args){
		System.out.println("This is 1D arrays time");
		char month[];
		month = new char[12];
		month[0] = 'j';
		month[1] = 'f';
		System.out.println(month[1]);
		int numbers[] = {0, 1, 2, 3, 4};
		System.out.println(numbers[2]);
		System.out.println("This is 2D arrays time");
		int i,j,k=0;
		int twoD[][] = new int[4][4];
		for (i=0;i<4;i++)
			for (j=0;j<4; j++){
				twoD[i][j] = k;
				k++;
			}
		for (i=0;i<4;i++){
			for (j=0;j<4; j++){
			System.out.print(twoD[i][j]+" ");}
			System.out.println();
		}
		//You can also give size like below
		char twoD2[][] = new char[4][];
		twoD2[0] = new char[1];
		twoD2[1] = new char[2];
		twoD2[2] = new char[3];
		twoD2[3] = new char[4];
		//int i,j;
		for (i=0;i<4;i++)
			for (j=0;j<i+1; j++){
				twoD2[i][j] = '*';
			}
		for (i=0;i<4;i++){
			for (j=0;j<i+1; j++){
			System.out.print(twoD2[i][j]+" ");}
			System.out.println();
		}
	}
}
