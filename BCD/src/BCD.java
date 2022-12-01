import java.util.ArrayList;

public class BCD {
	private int[] digits;
	BCD(int[] bcdDigits){
		digits = new int[bcdDigits.length];
		for(int i = 0; i<bcdDigits.length; i++)
			digits[i] = bcdDigits[i];
	}	
	
	BCD(int num){
		int digit = num % 10;
		num /= 10;
		digits = new int[1];
		digits[0] = digit;
		while(num>0) {
			digit = num % 10;
			addADigit(digit);
			num /= 10;
		}
	}
	
	public int numberOfDigits(){
		return digits.length;
	}
	
	public int nthDigit(int n) {
		if(digits.length == 0 || n >= digits.length)
			return 0;
		return digits[n];
	}
	
	public void addADigit(int newDigit) {
		int[] digits2 = new int[digits.length + 1];
		for(int i = 0; i < digits.length; i++) {
			digits2[i] = digits[i];
		}
		digits2[digits2.length-1] = newDigit;
		digits = digits2;
	}
	
	public BCD addBCDs(BCD other) {
		int largerBCDLength;
		int result = 0;
		int nextResult = 0;
		
		
		if(this.numberOfDigits() > other.numberOfDigits())
			largerBCDLength = this.numberOfDigits();
		else
			largerBCDLength = other.numberOfDigits();
		
		BCD sumBCD = new BCD(new int[0]);
		
		for(int i = 0; i < largerBCDLength + 1; i++) {
			result += this.nthDigit(i) + other.nthDigit(i);
			if(result >= 10) {
				result -= 10;
				nextResult = 1;
			}
			else
				nextResult = 0;
			sumBCD.addADigit(result);
			result = nextResult;
			nextResult = 0;
		}
		BCD sumBCD2 = new BCD(new int[0]);
		for(int i = 0; i < sumBCD.numberOfDigits()-sumBCD.zeroCount(); i++)
			sumBCD2.addADigit(sumBCD.nthDigit(i));
		
		return sumBCD2;
	}
	
	public BCD multiplyBCDs(BCD other) {
		int[][] lattice = new int[this.numberOfDigits()][other.numberOfDigits()];
		for(int row = this.numberOfDigits()-1; row > -1; row--) {
			for(int col = other.numberOfDigits()-1; col > -1; col--) {
				lattice[row][col] = (this.getDigits()[row]) * (other.getDigits()[col]);
			}
		}
		int[] DiagResults = addDiagonals(lattice);
		int[] array1 = new int[0];
		BCD answerBCD = new BCD(array1);

		int sum = DiagResults[0];
		int onesDigit;
		int remainder = 0;
		
		
		for(int i = 0; i<DiagResults.length;i++) {
			sum = DiagResults[i] + remainder;
			onesDigit = sum%10;
			remainder = (sum-onesDigit)/10;
			answerBCD.addADigit(onesDigit);
		}
		while(remainder>0) {
			onesDigit = remainder%10;
			remainder = remainder/10;
			answerBCD.addADigit(onesDigit);
		}
		int zeroCounter = 0;
		
		for(int i=0; i<answerBCD.numberOfDigits();i++) {
			if (answerBCD.nthDigit(i) == 0) {
				zeroCounter++;
			}
		}
		
		int[] zeroArray = {0};
		
		if(zeroCounter == answerBCD.numberOfDigits())
			answerBCD = new BCD(zeroArray);
		
		return answerBCD;
	}
	
	
	public static BCD factorial(int num) {
		BCD answerBCD = new BCD(1);
		BCD plusBCD = new BCD(2);
		BCD oneBCD = new BCD(1);
		int counter = 1;
		do {
			answerBCD = answerBCD.multiplyBCDs(plusBCD);
			plusBCD = plusBCD.addBCDs(oneBCD);
			counter++;
		} while (counter < num);
		return answerBCD;
	}
	
	public BCD pow (int num) {
		BCD answerBCD = new BCD(this.digits);
		BCD original = new BCD(this.digits);
		for(int i = 0; i<num-1; i++) {
			answerBCD = answerBCD.multiplyBCDs(original);
		}
		return answerBCD;
	}
	
	public String toString() {
		String x = "";
		for(int i = digits.length-1; i >= 0; i--) {
			x += digits[i];
		}
		if(x.length() > 3) {
			for(int i = x.length(), k = i; i > 0; i--) {
				if((k-i) % 3 == 0 && i != 0) {
					x = x.substring(0, i) + "," + x.substring(i);
				}
			}
				
		}
		if(x.length() > 3)
			x = x.substring(0, x.length()-1);
		if(x.length()>0) {
			if(x.substring(0,1).equals(","))
				x.substring(1);
		} else
			return "0";
		while((x.substring(0, 1).equals("0") && x.length()>1) || (x.substring(0,1).equals(","))) {
			x = x.substring(1);
		}
		return x;		
	}

	
	
	private int diagonalSum(int[][] lattice, int column, int row) {
		int result = 0;
		int width = lattice[0].length;
		int height = lattice.length;
		while(row<height && column>-1 && row>-1 && column<width) {
			result += lattice[row][column];	
			row--;
			column++;
		}
		return result;
	}
	
	private int[] addDiagonals(int[][] lattice){

		int height = lattice.length;

		int width = lattice[0].length;

		int diagonals = width+height-1;

		int[] result = new int[diagonals];

		int diag=diagonals-1;
				
		//Add the diagonals that end at the bottom

		for (int col=width-1;col>=0;col--){

		result[diag]=diagonalSum(lattice,col,height-1);

		diag--;

		}

		//Add the diagonals that end at the left side

		for (int row = height-2; row>=0; row--){

		result[diag]=diagonalSum(lattice,0,row);

		diag--;
		
		}

		return result;

		}
	
	public int[] getDigits() {
		return digits;
	}
	
	public int zeroCount() {
		int zeroCount = 0;
		if(this.numberOfDigits() > 1) {
			for(int i = 0; i < this.numberOfDigits(); i++) {
				if(this.nthDigit(i) == 0)
					zeroCount++;
				if(this.nthDigit(i) != 0)
					zeroCount = 0;
			}
		}
		return zeroCount;
	}
}
