// Zero test. 
// ZeroClass.java: Zero class free response practice.
//
// 1. Review requirements in 
// Free-Response-Practice-Instructions file.
// 2. Open the ZeroClass.pdf file.
// 3. Create the findZero method as described in part a of the
// pdf file. 
// 4. Create the setZeros method as described in part b of the
// pdf file.
public class ZeroClass {
	public static int findZero(int [] A, int pos){
	//TO BE IMPLEMENTED IN PART A
		/*
		Method findZero should return the index of the first element of the array A that 
		contains the value zero, starting from position pos. If no element of A from 
		position pos to the end of the array contains the value zero, then findZero should 
		return -1.
		*/
		for(int i = pos ; i < A.length; i++) {
			if(A[i] == 0) {
				return i;
			}
		}
		return -1;
	}
	public static void setZeros(int[]A){
	//TO BE IMPLEMENTED IN PART B

		/**	should find the positions of the first two zeros in its array Parameter A
		should set all of the intervening values (if any) to zero. 
		NOTE: If A only contains one zero, if it contains no zeros, 
			or if the first two zeros are right next to each other, 
			setZeros should not modify A.
		 */
		int firstZero = -1;
		int secondZero = -1;
		for(int i = 0; secondZero == -1 && i<A.length; i++) {
			if(A[i] == 0) {
				if(firstZero < 0)
					firstZero = i;
				else
					secondZero = i;
			}
		}
		if(secondZero > 0) {
			if(secondZero - firstZero != 1) {
				for(int j = firstZero; j<secondZero; j++) {
					A[j] = 0;
				}
			}
		}
	}


	// Do not run this until you are sure it works!!!
	public static void runZeroClassAcceptanceTest(){
		(new ZeroClassProblemTester()).generateCasesAndRun();
	}
	public static void main(String[] args) {
		runZeroClassAcceptanceTest();

	}
}
