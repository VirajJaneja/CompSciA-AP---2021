
public class MultiplicationTable {

// To be created as part of this practice	
public static int[][]createMultiplicationTable(int[] rowMultipliers){
	int maxNum = 0;
	int counter = 0;
	for(int num: rowMultipliers) {
		if(num > maxNum)
			maxNum = num;
	}
	
	while(maxNum <100) {
		counter++;
		maxNum *= counter;
		if(maxNum < 100)
			maxNum /= counter;
	}
	
	int[][] result = new int[--counter][rowMultipliers.length];
	
	int increasingNum = 1;
	
	for(int col = 0; col< rowMultipliers.length;col++) {
		for(int row = 0; row < counter; row++, increasingNum++) {
			result[row][col] = rowMultipliers[col] * increasingNum;
		}
		increasingNum = 1;
	}
	// Add code here
	return result;
	}
	
//Do not run this until you are sure it works	
public static void runMultiplicationTableAcceptanceTest(){
		(new MultiplicationTableTester()).generateCasesAndRun();
	}
	public static void main(String[] args) {
		runMultiplicationTableAcceptanceTest();

	}

}
