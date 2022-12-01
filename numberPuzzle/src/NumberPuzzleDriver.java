public class NumberPuzzleDriver {

	public static void main(String[] args) {
		NumberPuzzleOneDriver();
		
	}
	
	public static void NumberPuzzleOneDriver() {
		int[] one = {1, 3, 2};
		int[] two = {4, 6, 5};
		int[] three = {7, 0, 8};
		int[][] testArray = {one, two, three};
		
		int[] one2 = {1, 2, 3};
		int[] two2 = {4, 0, 5};
		int[] three2 = {6, 7, 8};
		int[][] testArray2 = {one2, two2, three2};
		
		int[] one3 = {1, 2, 3};
		int[] two3 = {4, 5, 6};
		int[] three3 = {7, 8, 0};
		int[][] testArray3 = {one3, two3, three3};
		
		NumberPuzzle test = new NumberPuzzle(testArray);
		NumberPuzzle test2 = new NumberPuzzle(testArray2);
		NumberPuzzle test23 = new NumberPuzzle(testArray2);
		NumberPuzzle test24 = new NumberPuzzle(testArray2);
		NumberPuzzle test25 = new NumberPuzzle(testArray2);
		NumberPuzzle test26 = new NumberPuzzle(testArray2);

		NumberPuzzle test3 = new NumberPuzzle(testArray3);
		NumberPuzzle test4 = new NumberPuzzle(testArray);
		
		System.out.println("can slide: " + test.canSlide("L"));
		System.out.println("can slide: " + test.canSlide("U"));
		System.out.println("can slide: " + test.canSlide("R"));
		System.out.println("solved: " + test.solved());
		System.out.println("equals: " + test.equals(test2));
		System.out.println("equals: " + test.equals(test4));
		System.out.println("get num: " + test.getNum(2, 0));
		System.out.println("emptys" + test.emptyCol() + " " + test.emptyRow());
		System.out.println("Solved three: " + test3.solved());
		System.out.println("Solved two: " + test2.solved());
		System.out.println();
		System.out.println("-------movement--------");
		System.out.println();
		test.printOutt();
		System.out.println(test.canSlide("D"));
		test = test.slide("D");
		System.out.println();
		test.printOutt();
		System.out.println("------------");
//		test2.printOutt();
//		System.out.println();
//		test23 = test2.slide("l");
//		test23.printOutt();
//		System.out.println();
//		test24 = test2.slide("R");
//		test24.printOutt();
//		System.out.println();
//		test25 = test2.slide("L");
//		test25.printOutt();
//		System.out.println();
		test26.printOutt();
		System.out.println("");
		test26 = test2.slide("l");
		test26.printOutt();
		System.out.println();
		test26 = test26.slide("l");
		test26.printOutt();
		System.out.println(test26.canSlide("l"));
		
	}

}
