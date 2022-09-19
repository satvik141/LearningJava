class Program1{
	public static void main(String args[]){
		System.out.println("Star Triangle 1");
		char star1[][] = new char[4][4];
		int i,j,k;
		System.out.println(1);
		for (i=0;i<4;i++){
			for (j=0;j<i+1;j++){
				star1[i][j] = '*';
			}
			for (j=i+1;j<4;j++){
				star1[i][j] = ' ';
			}
		}
		for (i=0;i<4;i++){
			for (j=0;j<4;j++){
				System.out.print(star1[i][j]+" ");
			}
			System.out.println();
		}
		char star2[][] = new char[4][4];
		//int i,j,k;
		System.out.println(2);
		for (i=0;i<4;i++){
			for (j=i;j<4;j++){
				star2[i][j] = '*';
			}
			for (j=0;j<i;j++){
				star2[i][j] = ' ';
			}
		}
		for (i=0;i<4;i++){
			for (j=0;j<4;j++){
				System.out.print(star2[i][j]+" ");
			}
			System.out.println();
		}
		for (i=0;i<4;i++){
			for (j=0;j<4;j++){
				System.out.print(star1[i][j]+" ");
			}
			for (j=0;j<4;j++){
				System.out.print(star2[i][j]+" ");
			}
			System.out.println();
		}
	}
}