
public class primary {

	public static void main(String[] args) {
		
		//BCD2driver();
		/*
		int[] myArray = {7, 2, 3, 6, 2};
		BCD b = new BCD(myArray);
		int[] myArray2 = {4, 5, 6, 7, 8};
		BCD c = new BCD(myArray2);
		BCD3driver();
		System.out.println((c.addBCDs(b)).toString());
		System.out.println(c.toString());
		System.out.println(b.toString());
		*/
		//BCD4driver();
		
		BCD BCD19 = new BCD(19);
		BCD BCD2 = new BCD(2);
		System.out.println("52: " + BCD.factorial(52));
		System.out.println("104: " +BCD.factorial(104));
		System.out.println("127: " + BCD2.pow(127).toString());
		System.out.println("19: " + BCD19.pow(19));
		

		
	}
	
	public static void BCD4driver() {
				
//		int[] array1 = {};
//		BCD BCD1 = new BCD(array1);
//		int[] array1_2 = {};
//		BCD BCD1_2 = new BCD(array1_2);
//		System.out.println(BCD1.addBCDs(BCD1_2));
//		
//		int[] array2 = {0};
//		BCD BCD2 = new BCD(array2);
//		int[] array2_2 = {};
//		BCD BCD2_2 = new BCD(array2_2);
//		System.out.println(BCD2.addBCDs(BCD2_2));
//		
		int[] array3 = {0, 0, 0};
		BCD BCD3 = new BCD(array3);
		int[] array3_3 = {2, 0, 3};
		BCD BCD3_3 = new BCD(array3_3);
		System.out.println(BCD3.multiplyBCDs(BCD3_3).toString());
		
//		
//		int[] array4 = {0, 3, 0, 0};
//		BCD BCD4 = new BCD(array4);
//		int[] array4_4 = {0, 4, 0};
//		BCD BCD4_4 = new BCD(array4_4);
//		System.out.println(BCD4.addBCDs(BCD4_4));
//		BCD4 = BCD4.addBCDs(BCD4_4);
//		
//		for(int i = 0; i < BCD4.numberOfDigits(); i++) {
//			System.out.println(BCD4.nthDigit(i));
//		}
//
//		
//		int[] array5 = {0, 0, 3};
//		BCD BCD5 = new BCD(array5);
//		int[] array5_5 = {0, 5};
//		BCD BCD5_5 = new BCD(array5_5);
//		System.out.println(BCD5.addBCDs(BCD5_5));
//		
//		int[] array6 = {0, 6, 9};
//		BCD BCD6 = new BCD(array6);
//		int[] array6_6 = {0, 6};
//		BCD BCD6_6 = new BCD(array6_6);
//		System.out.println(BCD6.addBCDs(BCD6_6));
//		
//		int[] array7 = {0, 7, 9};
//		BCD BCD7 = new BCD(array7);
//		int[] array7_7 = {0, 7};
//		BCD BCD7_7 = new BCD(array7_7);
//		System.out.println(BCD7.addBCDs(BCD7_7));
//		
//		int[] array8 = {0, 8};
//		BCD BCD8 = new BCD(array8);
//		int[] array8_8 = {0, 2, 9};
//		BCD BCD8_8 = new BCD(array8_8);
//		System.out.println(BCD8.addBCDs(BCD8_8));
//		
//		
//		int[] array9 = {9, 9, 9};
//		BCD BCD9 = new BCD(array9);
//		int[] array9_9 = {9, 9, 9};
//		BCD BCD9_9 = new BCD(array9_9);
//		System.out.println(BCD9.addBCDs(BCD9_9));
//		
	}
	
	public static void BCD3driver() {
		BCD zeroNum = new BCD(0);
		System.out.println(zeroNum.toString());
		
		BCD oneNum = new BCD(6);
		System.out.println(oneNum.toString());
		
		BCD threeNums = new BCD(345);
		System.out.println(threeNums.toString());
		
		BCD fourNums = new BCD(2578);
		System.out.println(fourNums.toString());
		
		BCD sixNums = new BCD(123456);
		System.out.println(sixNums.toString());
		
		BCD nineNums = new BCD(987654321);
		System.out.println(nineNums.toString());
	}
	
	public static void BCD2driver(){
		int zeroArray[] = {};
		BCD zeroBCD = new BCD(zeroArray);
		System.out.println("zeroBCD:");
		System.out.println(zeroBCD.numberOfDigits());
		System.out.println(zeroBCD.nthDigit(0));
		zeroBCD.addADigit(4);
		System.out.println(zeroBCD.nthDigit(0));

		
		int oneDigitArray[] = {7};
		BCD oneDigitBCD = new BCD(oneDigitArray);
		System.out.println("oneDigitBCD:");
		System.out.println(oneDigitBCD.numberOfDigits());
		System.out.println(oneDigitBCD.nthDigit(0));
		System.out.println(oneDigitBCD.nthDigit(1));
		oneDigitBCD.addADigit(4);
		System.out.println(oneDigitBCD.nthDigit(0));


		
		int twoDigitArray[] = {5, 3};
		BCD twoDigitBCD = new BCD(twoDigitArray);
		System.out.println("twoDigitBCD:");
		System.out.println(twoDigitBCD.numberOfDigits());
		System.out.println(twoDigitBCD.nthDigit(0));
		System.out.println(twoDigitBCD.nthDigit(1));
		System.out.println(twoDigitBCD.nthDigit(2));
		twoDigitBCD.addADigit(4);
		System.out.println(twoDigitBCD.nthDigit(2));

		
		int multiDigitArray[] = {8, 2, 9};
		BCD multiDigitBCD = new BCD(multiDigitArray);
		System.out.println("multiDigitBCD:");
		System.out.println(multiDigitBCD.numberOfDigits());
		System.out.println(multiDigitBCD.nthDigit(1));
		System.out.println(multiDigitBCD.nthDigit(2));
		System.out.println(multiDigitBCD.nthDigit(3));
		multiDigitBCD.addADigit(4);
		System.out.println(multiDigitBCD.nthDigit(3));

		
	}
}