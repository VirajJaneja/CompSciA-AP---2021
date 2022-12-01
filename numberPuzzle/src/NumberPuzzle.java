import java.util.ArrayList;

public class NumberPuzzle {
	int[][] numberPuzzle = new int[3][3];
	NumberPuzzle(int[][] nums){
		for(int i = 0; i<3;i++) {
			for(int j = 0; j<3; j++) {
				numberPuzzle[i][j] = nums[i][j];
			}
		}
	}
	
	public int getNum(int row, int column) {
		if(numberPuzzle[row][column] == 0)
			return 0;
		return numberPuzzle[row][column];
	}
	
	public int emptyRow() {
		for(int i =0; i<3;i++) {
			for(int j=0;j<3;j++) {
				if(numberPuzzle[i][j] == 0)
					return i;
			}
		}
		return 1;
	}
	
	public int emptyCol() {
		for(int i =0; i<3;i++) {
			for(int j=0;j<3;j++) {
				if(numberPuzzle[i][j] == 0)
					return j;
			}
		}
		return 1;
	}
	
	public boolean solved() {
		int checker = 1;
		int counter=0;
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++, checker++) {
				if (numberPuzzle[i][j] == checker)
					counter++;
			}
		}
		
		if(counter == 8)
			return true;
		return false;
	}
	
	public NumberPuzzle slide(String dir) {
		int[][] copy = new int[3][3];
		
		for(int i = 0; i<3;i++) {
			for(int j = 0; j<3; j++) {
				copy[i][j] = numberPuzzle[i][j];
			}
		}
		
		int row =this.emptyRow();
		int col =this.emptyCol();
		
		int temp;
		if(canSlide(dir)) {
			if(dir.equalsIgnoreCase("D")) {
				temp = copy[row][col];
				copy[row][col] = copy[row-1][col];
				copy[row-1][col] = temp;
			}
			if(dir.equalsIgnoreCase("U")) {
				temp = copy[row][col];
				copy[row][col] = copy[row+1][col];
				copy[row+1][col] = temp;
			}
			if(dir.equalsIgnoreCase("R")) {
				temp = copy[row][col];
				copy[row][col] = copy[row][col-1];
				copy[row][col-1] = temp;
			}
			if(dir.equalsIgnoreCase("L")) {
				temp = copy[row][col];
				copy[row][col] = copy[row][col+1];
				copy[row][col+1] = temp;
			}
		}
		NumberPuzzle newPuzzle = new NumberPuzzle(copy);
		return newPuzzle;
	}
	
	public boolean canSlide(String dir) {
		
		if(dir.equalsIgnoreCase("D") && emptyRow() == 0) {
			return false;
		}
		if(dir.equalsIgnoreCase("U") && emptyRow() == 2) {
			return false;
		}
		if(dir.equalsIgnoreCase("L") && emptyCol() == 2) {
			return false;
		}
		if(dir.equalsIgnoreCase("R") && emptyCol() == 0) {
			return false;
		}
		return true;
	}
	public boolean equals(NumberPuzzle other) {
		int counter = 0;
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				if(other.getNum(i, j) == this.getNum(i, j))
					counter++;
			}
		}
		if(counter == 9)
			return true;
		return false;
	}

	public void printOutt() {
		for(int row = 0; row<3; row++) {
			for(int col = 0; col<3; col++) {
				System.out.print(numberPuzzle[row][col]);
			}
			System.out.println();
		}
	}
	public String solveNumberPuzzle(ArrayList<NumberPuzzle> restricted, int maxMoves) {
		String result = null;
		if(maxMoves == 0)
			return result;
		result = "";
		
		return result;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
