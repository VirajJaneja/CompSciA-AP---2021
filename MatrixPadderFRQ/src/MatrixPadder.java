public class MatrixPadder {

	public static int[][]createPaddedMatrix(int[] arr, int columns, int pad){
		//Add code to this method
		int counter =0;
		int length = arr.length;
		
		while(length%columns != 0) {
			length++;
		}
		int[][] result = new int[length/columns][columns];
		for(int i = 0; i<result.length; i++) {
			for(int j = 0; j<result[i].length;j++) {
				if(arr.length>counter) {
					result[i][j] = arr[counter];
					counter++;
				} else
					result[i][j] = pad;
			}
		}
		return result;
	}
	
	// Do not run this until you are sure it works!!!
	public static void runMatrixPadderAcceptanceTest(){
		(new MatrixPadderTester()).generateCasesAndRun();
	}
	public static void main(String[] args) {
		runMatrixPadderAcceptanceTest();
	}

}
