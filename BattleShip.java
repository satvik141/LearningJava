import java.util.*;

public class BattleShip{
	int sea[][];
	int size;
	Random  rn = new Random();
	public BattleShip(int size){
		this.size=size;
		sea = new int[this.size][this.size];
	}

	public void getSea(){
		System.out.println("BattleShip Game: ");
		System.out.print(" ");
		for(int j=1;j<=size;j++){
			System.out.print(" "+j);
		}
		System.out.println();
		char ch = 'A';
		for(int i=0;i<size;i++){
			System.out.print(ch++);
			for(int j=0;j<size;j++){
				System.out.print(" "+sea[i][j]);
			}
			System.out.println();
		}
	}

	public void setSea(){
		for(int i=1;i<=size;i++){
			int row = rn.nextInt(0,size);
			int column = rn.nextInt(0,size);
			if (sea[row][column]==1) i--;
			else sea[row][column]=1;
		}
	}

	public void getInput(BattleShip ob){ 
		Scanner sc = new Scanner(System.in);
		int chances = size;
		int ships = size;
		while(chances>0 && ships>0){
			getSea();
			System.out.print("Guess the ship place: ");
			while(true){
				String place = sc.nextLine();
				int r = (int) place.charAt(0)-65;
				int c = Integer.parseInt(place.split("[A-Z]+")[1])-1;
				if ((r>=0 && r<size)&&(c>=0 && c<size)){
					if (ob.sea[r][c]==1) {
						if(sea[r][c]==1) {System.out.println("Ship is already sunk."); break;}
						sea[r][c]=1;
						ships--;
						System.out.println("You Just sunk a ship.\nRemaining Ships: "+ships);
						break;
					}
					else {
						chances--;
						System.out.printf("Oops! No Ships are available at %s.\nRemaining Chances %s.\n",place,chances);
						System.out.println("Try another place.");
						break;
						}
				}
				else System.out.printf("Place %s Not-Avilable.\n",place);
				//break;
			}
			
		}
		sc.close();
		if(chances==0) System.out.println("\n\nNo Chances Available\nLose:(\nGAME OVER");
		if(ships==0) System.out.println("\n\nHURRY! You Won");
	}
	
	public static void main(String args[]){
		BattleShip gameSea = new BattleShip(5);
		BattleShip acualSea = new BattleShip(5);
		acualSea.setSea();
		acualSea.getSea();
		gameSea.getInput(acualSea);
		
	}
}