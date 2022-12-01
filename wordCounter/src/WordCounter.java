
public class WordCounter {
	
	
	public static int[] allNums(String[] A, String[] B){	
		int[] counter = new int[B.length];
	
		for(int i = 0; i<B.length;i++) {
			for(int j = 0; j<A.length; j++) {
				if(B[i].equals(A[j]))
					counter[i]++;
			}
		}	
		return counter;
	
	}

	// Do not run this until you are sure it works!!!
	public static void runWordCounterAcceptanceTest(){
		(new WordCounterTester()).generateCasesAndRun();
	}
	public static void main(String[] args) {
		runWordCounterAcceptanceTest();
	}
	/**
	 * @param args
	 */

}
