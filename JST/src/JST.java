

public class JST {
	
	
	/*
	 * The following method adds 2 to the value
	 * of x and returns the result. Change the
	 * body of the function (between the curly
	 * brackets {}) so that it adds 4 to the
	 * value of x instead.
	 */
	public static int JST_1_1_1(int x){
		x=x+4;
		return x;
	}

	/*
	 * The following method multiplies 3 by x
	 * and returns the result. Change the
	 * body of the function so that it 
	 * multiplies x by 5 instead.
	 */
	public static int JST_1_1_2(int x){
		x=x*5;
		return x;
	}
	
	/*
	 * The following method divides x by 2
	 * and returns the result. Change the
	 * body of the function so that it 
	 * divides x by 6.
	 */
	public static int JST_1_1_3(int x){
		x=x/6;
		return x;
	}
	
	/*
	 * The following method returns the value
	 * of x. Change the body of the method
	 * so that it returns x minus 7.
	 */
	public static int JST_1_1_4(int x){
		return x-7;
	}
	
	/*
	 * The following method returns the value
	 * the remainder of x divided by 2. Change
	 * it so that it returns the remainder of
	 * x when divided by 3.
	 */
	public static int JST_1_1_5(int x){
		x = x % 3;
		return x;
	}
	
	/*
	 * The following method returns the value
	 * of x divided by 2. Change
	 * it so that it returns the remainder of
	 * x when divided by 6.
	 */
	public static int JST_1_1_6(int x){
		return x % 6;
	}
	
	/*
	 * The following method returns the value
	 * the value x. Place (int) immediately
	 * before the return value so that it removes
	 * everything after the decimal point is
	 * removed. Note that the word int must be
	 * surrounded by parentheses
	 */
	public static double JST_1_1_7(double x){
		return (int)x;
	}
	
	/*
	 * The following method multiplies x by y,
	 * subtracts z and returns the result.
	 * Change the method so that it first subtracts z
	 * from y (y-z) and then multiplies that product
	 * by x, returning the result.
	 * 
	 */
	public static int JST_1_1_8(int x, int y, int z){
		return (y -z) * x;
	}
	
	/*
	 * The following method returns the value
	 * of the variable x. Change it so that it
	 * returns the value of x added to the value
	 * of y and divided by the value of z.
	 * 
	 */
	public static int JST_1_1_9(int x, int y, int z){
		return (x + y) / z;
	}
	
	/*
	 * This method adds 4 to the variable x
	 * and then returns its value. Change the method
	 * to add 8 to the variable x instead.
	 */
	
	public static int JST_1_2_1(int x){
		x+=8;
		return x;
	}
	
	/*
	 * This method subtracts 2 from the variable x
	 * and then returns its value. Change the method
	 * so that it multiplies the variable x 
	 * by 2 instead.
	 */
	
	public static int JST_1_2_2(int x){
		x*=2;
		return x;
	}
	
	/*
	 * This method adds 1 to the variable x
	 * and returns the new value. Change it
	 * so that it adds 1 to y instead and
	 * then returns the new value of y.
	 */
	
	public static int JST_1_2_3(int x, int y){
		y++;
		return y;
	}
	
	/*
	 * This method adds 1 to the variable x
	 * and returns the new value. Change it
	 * so that it instead subtracts 1 from
	 * x and returns the new value.
	 */
	
	public static int JST_1_2_4(int x, int y){
		x--;
		return x;
	}
	
	/*
	 * This method multiplies x by the square
	 * root of two and returns the result.
	 * Change it so that it multiplies x
	 * by the square root of three instead.
	 */
	
	public static double JST_1_3_1(double x){
		x *= Math.sqrt(3);
		return x;
	}
	
	/*
	 * This method returns the cosine of the
	 * variable x. Change it so that it returns
	 * the sine of the variable x.
	 */
	
	public static double JST_1_3_2(double x){
		return Math.sin(x);
	}
	
	/*
	 * This method returns the larger of
	 * the two values stored in variables x and y. Change
	 * it so that it returns the larger of the
	 * two values in variables y and z.
	 */
	
	public static double JST_1_3_3(double x, double y, double z){
		return Math.max(z,y);
	}
	
	/*
	 * This method returns the value of x if
	 * it's smaller than 10. Otherwise it
	 * returns 10. Change it so that it returns
	 * 5 if x is smaller than 5, and the value
	 * of x otherwise.
	 */
	
	public static double JST_1_3_4(double x){
		return Math.max(x,5);
	}
	
	/*
	 * This method returns a random integer
	 * number larger than or equal to one and
	 * less than or equal to 3. Change it so 
	 * it returns a random integer larger than 
	 * or equal to zero and less than or equal
	 * to 6.
	 */
	
	public static int JST_1_3_5(){
		return (int)( (Math.random()*7));
	}
	
	/*
	 * This method returns a random integer
	 * number larger than or equal to zero and
	 * less than or equal to 4. Change it so 
	 * it returns a random integer larger than 
	 * or equal to one and less than or equal to 5.
	 */
	
	public static int JST_1_3_6(){
		int x = (int)(Math.random()*6);
		if(x>=1)
			return x;
		else
			return x + 1;
	}
	
	/*
	 * The following method returns a substring
	 * of string s that starts at the third
	 * character in s (numbered 2, since
	 * numbering in strings start at 0) and ends
	 * before the 5th character in s (numbered 4).
	 * Change it so the returned substring ends
	 * before the 6th character in s (numbered 5).
	 */
	
	public static String JST_2_1_1(String s){
		return s.substring(2,5);
	}
	
	/*
	 * The following method returns a substring
	 * of string s that starts at the first
	 * character in s (numbered 0) and ends
	 * before the 8th character in s (numbered 7).
	 * Change it so the returned substring
	 * starts at the second character in s
	 * (numbered 1).
	 */
	
	public static String JST_2_1_2(String s){
		return s.substring(1,7);
	}
	/*
	 * The following method returns the string s.
	 * Change it so that it returns a substring
	 * of s that starts at the 2nd character
	 * of s (numbered 1) and ends before the
	 * 6th character of s (numbered 5).
	 */
	
	public static String JST_2_1_3(String s){
		return s.substring(1, 5);
	}
	
	/*
	 * The following method returns a substring
	 * of string s that starts at the 4th
	 * character in s (numbered 3) and
	 * contains all the following characters
	 * in the string. Change it so that the 
	 * returned string instead starts at the 3rd
	 * character in s (numbered 2).
	 */
	
	public static String JST_2_1_4(String s){
		return s.substring(2);
	}
	
	/*
	 * The following method returns the string
	 * s. Change it so that it returns all but
	 * the first character in s.
	 */
	
	public static String JST_2_1_5(String s){
		return s.substring(1);
	}
	
	/*
	 * The following method returns the string
	 * ABC. Change it so that it returns the
	 * string XYZ.
	 */
	
	public static String JST_2_1_6(){
		return "XYZ";
	}

	/*
	 * The following method returns the
	 * length of the string s. Change it so
	 * that it returns the length of s plus 1.
	 */
	
	public static int JST_2_1_7(String s){
		return s.length()+1;
	}

	/*
	 * The following method returns the
	 * number 6. Change it so that it instead
	 * returns twice the length of the string s.
	 */
	
	public static int JST_2_1_8(String s){
		return s.length()*2;
	}

	/*
	 * The following string returns a string
	 * that is equal to s followed by the letter
	 * L. Change it so that it returns a string
	 * that is equal to s followed by the letter
	 * D.
	 */
	public static String JST_2_2_1(String s){
		return s+"D";
	}
	
	/*
	 * The following method returns the string
	 * s. Change it so that it returns a string
	 * containing the word "My" followed by
	 * a space followed by whatever is in
	 * string s.
	 */
	public static String JST_2_2_2(String s){
		return "My" + " " + s;
	}
	
	/*
	 * The following method returns the string
	 * s. Change it so that it returns the
	 * string s followed by a comma followed
	 * by the string t.
	 */

	public static String JST_2_2_3(String s, String t){
		return s + "," + t;
	}
	
	/*
	 * The following method sets the value of 
	 * the variable t to the empty string
	 * and returns the string "B". Change it
	 * so that it always returns the empty
	 * string.
	 */
	
	public static String JST_2_2_4(){
		String t;
		t="";
		return t;
	}
	
	/*
	 * The following method returns true if
	 * s is equal to the string ABC and false
	 * otherwise. Change the method so that it
	 * returns true if s is equal to the string
	 * DEF and false otherwise.
	 */
	public static boolean JST_2_3_1(String s){
		boolean isItEqual = s.equals("DEF");
		return isItEqual;
	}
	
	/*
	 * The following method returns true always.
	 * Change it so that it returns true if and
	 * only if the string s equals PQRST.
	 */
	public static boolean JST_2_3_2(String s){
		boolean isItEqual = s.equals("PQRST");
		return isItEqual;
	}
	
	/*
	 * The following method returns true always.
	 * Change it so that it returns true if and
	 * only if the string s is equal to the
	 * string t.
	 */
	public static boolean JST_2_3_3(String s, String t){
		return s.equals(t);
	}
	
	/*
	 * The following method returns where in string s, the
	 * substring GHI will be found (with 0 being the start
	 * of the string). If GHI is not anywhere in string s,
	 * it will return -1.
	 * Change it so that it return the location of string
	 * JKL instead of the string GHI.
	 */
	public static int JST_2_4_1(String s){
		return s.indexOf("JKL");
	}
	
	/*
	 * The following method returns -1. Change it so that it
	 * only returns -1 if string s does not contain the substring
	 * MNO. Otherwise it returns the position in s where MNO
	 * starts (where 0 is the beginning of the string).
	 */
	
	public static int JST_2_4_2(String s){
		return s.indexOf("MNO");
	}
	
	/*
	 * This method returns 6 if x is 12 and 4 otherwise.
	 * change it so that it returns 6 only if x is 10
	 * and 4 otherwise.
	 */
	public static int JST_3_1_1(int x){
		int y = 4;
		if (x == 10)
			y=6;
		return y;
	}
	
	/*
	 * This method returns 9 if x is greater than 3 and 7
	 * otherwise. Change it so that it returns 9 if x is
	 * LESS THAN three and 7 otherwise.
	 */
	public static int JST_3_1_2(double x){
		int y = 7;
		if (x < 3)
			y=9;
		return y;
	}
	
	/*
	 * This method returns 14 if x is greater or equal
	 * to 2 and 11 otherwise. Change it to return 14 only if
	 * x is less than or equal to 2 and 11 otherwise.
	 */
	public static int JST_3_1_3(double x){
		int y = 11;
		if (x <= 2)
			y=14;
		return y;
	}
	
	/*
	 * This method returns 3 if x is not equal to 9 and 5
	 * otherwise. Change it so that it returns 3 only if x
	 * is not equal to 6, and 5 otherwise.
	 */
	public static int JST_3_1_4(double x){
		int y = 5;
		if (x != 6.0)
			y=3;
		return y;
	}
	
	/*
	 * This method returns 1 if x is equal to 15 and 0
	 * otherwise. Change it so that it returns 1 only if x
	 * is less than 15, and 5 otherwise.
	 */
	public static int JST_3_1_5(double x){
		int y = 5;
		if (x < 15.0)
			y=1;
		return y;
	}
	
	/*
	 * This method returns 2 if x is greater than 9 and 4
	 * otherwise. Change it so that it returns 2 only if
	 * x is not equal to 9, and 4 otherwise.
	 */
	public static int JST_3_1_6(double x){
		int y = 4;
		if (x != 9)
			y=2;
		return y;
	}
	
	/*
	 * This method always returns 8. Change so that it
	 * returns 12 when x is equal to 1 and 8 otherwise.
	 */
	public static int JST_3_1_7(double x){
		int y = 8;
		if (x==1)
			y = 12;
		return y;
	}
	
	/*
	 * This method calls the Recorder.record method passing
	 * 1 as a parameter. This call is made no matter what
	 * the value of x is. Then it makes two more calls to
	 * that method, passing 2 and 3 as parameters, but only
	 * if x is greater than 4.
	 * Change the method so that all 3 calls are only made if
	 * x is greater than 4.
	 * Be aware that when an if statement is followed by an
	 * open curly bracket ({) it applies only to statements
	 * between that bracket and the matching close curly
	 * bracket (}).
	 */
	
	public static void JST_3_2_1(double x){
		if (x>4){
			Recorder.record(1);
			Recorder.record(2);
			Recorder.record(3);
		}
	}

	/*
	 * This method calls the Recorder.record method twice 
	 * passing 1 and then 2 as a parameter, but only if
	 * the parameter x is not equal to 3. It then calls
	 * Recorder.record(3) all time.
	 * Change it so that it makes all three calls only if
	 * x is not equal to 3.
	 */
	public static void JST_3_2_2(int x){
		if (x!=3){
			Recorder.record(1);
			Recorder.record(2);
			Recorder.record(3);
		}
		
	}

	/*
	 * This method calls the Recorder.record method twice 
	 * passing 1 and then 2 as a parameter, but only if
	 * the parameter x is greater than 5. Change it so that
	 * it continues to call Recorder.record(1) when x is
	 * greater than 5, but then it always calls Recorder.record(2)
	 */
	public static void JST_3_2_3(int x){
		if (x>5){
			Recorder.record(1);
			
		}
		Recorder.record(2);
	}

	/*
	 * This method calls the Recorder.record method three 
	 * times, passing 1, 2 and then 3 as a parameter, but 
	 * only if the parameter x is less than 11. Change it 
	 * so that it will always call Recorder.record(1) when
	 * the method is called, and then call it twice more,
	 * with 2 and 3 as parameters only if x is less than 11.
	 */
	public static void JST_3_2_4(int x){
		Recorder.record(1);
		if (x<11){
			Recorder.record(2);
			Recorder.record(3);
		}
	}
	
	/*
	 * This method always calls the Recorder.record
	 * method 4 times, passing 1, 2, 3, and 4 as
	 * parameters. Change it so that it always calls
	 * Recorder.record(1), then calls Recorder.record(2)
	 * and Recorder.record(3)only if x is less than 9,
	 * then calls Recorder.record(4) regardless of the
	 * value of x.
	 */
	public static void JST_3_2_5(int x){
		Recorder.record(1);
		if(x < 9) {	
			Recorder.record(2);
			Recorder.record(3);
		}
		Recorder.record(4);
	}
	
	/*
	 * This method returns 4 only if x is greater than
	 * 7 and y is less than 13. Otherwise it returns 3.
	 * Change it so that it returns 4 only if x is
	 * is greater than 7 and z equals 2.
	 */
	public static int JST_3_3_1(int x, int y, int z){
		int a=3;
		if ((x>7) && (z==2))
			a=4;
		return a;
	}

	/*
	 * This method returns 1 only if x is equal to 9
	 * or x is equal to 3, and 6 otherwise. Change it
	 * so that it returns 1 only if x is equal to 9
	 * or x is less than 3, and 6 otherwise.
	 */
	public static int JST_3_3_2(int x){
		int a=6;
		if ((x==9) || (x<3))
			a=1;
		return a;
	}

	/*
	 * This method returns 4 only if x is equal to 2
	 * and 12 otherwise. Change it to return 4 only if
	 * x is equal to 2 and y is equal to 16, and to
	 * return 12 otherwise.
	 */
	public static int JST_3_3_3(int x, int y){
		int a=12;
		if ((x==2) && (y==16))
			a=4;
		return a;
	}

	/*
	 * This method returns 5 only if x is equal to 7
	 * and 10 otherwise. Change it to return 5 if
	 * x is equal to 7 or x is equal to 9, and to
	 * return 10 otherwise.
	 */
	public static int JST_3_3_4(int x){
		int a=10;
		if ((x==7) || (x==9))
			a=5;
		return a;
	}

	/*
	 * This method returns 3 if s is NOT equal to DOG
	 * and t IS equal to CAT. It returns 8 otherwise.
	 * Change it so that it returns 3 if s is not
	 * equal to DOG and t is not equal to CAT, returning
	 * 8 otherwise.
	 */
	public static int JST_3_3_5(String s, String t){
		int a=8;
		if ((!s.equals("DOG")) && (!t.equals("CAT")))
			a=3;
		return a;
	}
	
	/*
	 * This method calls Recorder.record(1) if x is
	 * greater than 2 and Recorder.record(2) otherwise.
	 * Change it so that if x is not greater than 2, it
	 * calls Recorder.record(3) instead.
	 */

	public static void JST_3_4_1(int x){
		if (x>2)
			Recorder.record(1);
		else
			Recorder.record(3);
	}
	
	/*
	 * This method calls Recorder.record(1) if x is
	 * greater than or equal to 7. Change it so that
	 * it continue to do that, but will also call
	 * Recorder.record(2) if x is NOT greater than or
	 * equal to 7.
	 */

	public static void JST_3_4_2(int x){
		
		if (x>=7)
			Recorder.record(1);
		else
			Recorder.record(2);
	}
	
	/*
	 * This method calls Recorder.record(1) and 
	 * Recorder.record(2) if x is
	 * less than or equal to 9. Otherwise it calls
	 * Recorder.record(3) and Recorder.record(4).
	 * Finally it calls Recorder.record(5).
	 * Change it so that it only calls
	 * Recorder.record(5) when x is less than or equal
	 * to 9, but makes the other calls to Recorder.record
	 * exactly as it does now.
	 */

	public static void JST_3_4_3(int x){
//			System.out.println("Called with: "+x);
		if (x<=9){
			Recorder.record(1);
			Recorder.record(2);
			Recorder.record(5);
		} else {
			Recorder.record(3);
			Recorder.record(4);
		}
	}

	/*
	 * This method calls Recorder.record six times,
	 * passing the numbers 1 through 6 as parameters.
	 * Change it so that it calls Recorder.record(1),
	 * the calls both Recorder.record(2) and
	 * Recorder.record(3) if x equals zero, and calls
	 * both Recorder.record(4) and Recorder.record(5)
	 * otherwise. Finally it calls Recorder.record(6)
	 * regardless of the value of x.
	 */
	public static void JST_3_4_4(int x){
		Recorder.record(1);
		if (x==0) {
			Recorder.record(2);
			Recorder.record(3);
		} else {
			Recorder.record(4);
			Recorder.record(5);
		}

		Recorder.record(6);
	}	

	/*
	 * If x is greater than 3, this method calls
	 * Recorder.record(1). If y is also greater than 3
	 * it then calls Recorder.record(2).
	 * Change it so that only calls Recorder.record(1) if
	 * z is greater than 5. 
	 */
	public static void JST_3_4_5(int x, int y, int z){
		if (z>5){
			Recorder.record(1);
			if (y>3)
				Recorder.record(2);
		}
	}


	/*
	 * If x less than 7, this method calls
	 * Recorder.record 3 times passing 1, 2, and 3
	 * as parameters. Change it so Recorder.record(1)
	 * and Recorder.record(2) are only called if y
	 * is less than or equal to 9 (in addition to x 
	 * being less than 7), with no changes made
	 * to when Recorder.record(3) is called.
	 */
	public static void JST_3_4_6(int x, int y){
		
		if (x<7){
			if (y <= 9) {
			Recorder.record(1);
			Recorder.record(2);
			}
			Recorder.record(3);
		}
		
	}

	/*
	 * If x is not equal to 10, this method calls
	 * Recorder.record 4 times passing 1, 2, 3, and 4
	 * as parameters. Change it so Recorder.record(1)
	 * and Recorder.record(2) are only called if y
	 * is equal to x and Recorder.record(3) and
	 * Recorder.record(4) are called otherwise.
	 */
	public static void JST_3_4_7(int x, int y){
		if (x==y){
			Recorder.record(1);
			Recorder.record(2);
		} else {
			Recorder.record(3);
			Recorder.record(4);
		}
	}
	
	/*
	 * This method keeps calling Recorder.record passing 4
	 * as a parameter until it returns a value other than
	 * 2. Change it so that it keeps calling that method
	 * until it returns a value greater than 2.
	 */
	public static void JST_4_1_1(){
		int x=0;
		do {
			x = Recorder.record(4);
		} while (x<=2);
	}
	
	/*
	 * This method calls Recorder.record(1) and then
	 * Recorder.record(2). It continues doing this as
	 * long as long as Recorder.record(2) returns a number
	 * greater than 10.
	 * Change it so that Recorder.record(1) is only called
	 * once (i.e. is not part of the do while loop).
	 */
	public static void JST_4_1_2(){
		int x=0;
		Recorder.record(1);
		do {
			x = Recorder.record(2);
		} while (x>10);
	}
	
	/*
	 * This method calls Recorder.record(1) as long as
	 * it returns a value less than 5. It counts how
	 * many times this occurs. It then calls
	 * Recorder.record(2). Change it so that the last
	 * call to Recorder.record passes as a parameter
	 * the number of times the loop iterated.
	 */
	public static void JST_4_1_3(){
		int x=0, counter=0;
		do {
			counter = counter + 1;
			x = Recorder.record(1);
		} while (x<5);
		Recorder.record(counter);
	}
	
	/*
	 * This method calls Recorder.record(3) and
	 * assigns the value to x. Change it so that
	 * it continues to call Recorder.record(3)
	 * as long as it returns a value that is not 9.
	 */
	public static void JST_4_1_4(){
		int x=0;
		do {
			x = Recorder.record(3);
		} while (x!=9);
		
	}
	
	/*
	 * This method calls Recorder.record(1) repeatedly
	 * while it returns a value greater than 5. Then
	 * it calls Recorder.record(0).
	 * Change it so that instead of passing 0 to the
	 * last call to Recorder.record, it passes the
	 * number of times Recorder.record(1) was called.
	 * Hint: Declare a variable that "counts" the
	 * number of calls and add one to it each time
	 * Recorder.record(1) is called. 
	 */
	public static void JST_4_1_5(){
		int x, yy=0;
		do {
			yy++;
			x= Recorder.record(1);
		} while (x>5);
		Recorder.record(yy);
	}
	
	/*
	 * This method calls Recorder.record(2) once. Change
	 * it so that it calls Recorder.record(2) until
	 * it returns 6, and then passes the number of times
	 * Recorder.record(2) was called to Recorder.record.
	 */
	
	public static void JST_4_1_6(){
		int yy = 0;
		do {
			yy++;
			int x = Recorder.record(2);
			if(x == 6)
				break;
		} while (1 < 2);
		Recorder.record(yy);
	}
	
	/*
	 * This method calls Recorder.record(1) and assigns
	 * its return value to the variable x. While x is
	 * less than 12, it continues to assign the return
	 * value of Recorder.record(2). Then it calls
	 * Recorder.record passing the final value of x.
	 * Change it so it continues to call
	 * Recorder.record(2) while the value is less than
	 * 7.
	 */
	
	public static void JST_4_1_7(){
		int x = Recorder.record(1);
		while (x < 7)
			x = Recorder.record(2);
		Recorder.record(x);
	}

	/*
	 * This method calls the Recorder.record with
	 * progressively higher parameters starting at x
	 * and ending at 5. E.g. if x were 2, would
	 * call it with 2, then 3, then 4, then 5. Change it
	 * so that it starts at x and passes parameters up
	 * to 7.
	 */
	
	public static void JST_4_2_1(int x){
		for (int i=x; i<=7; i++)
			Recorder.record(i);
	}

	/*
	 * This method calls the Recorder.record repeatedly,
	 * passing as parameters, all the numbers starting 
	 * at two and ending at x.
	 * Change it so it passes numbers starting at 3 and
	 * ending at x.
	 */
	
	public static void JST_4_2_2(int x){
		for (int i=3; i<=x; i++)
			Recorder.record(i);
	}

	/*
	 * This method calls the Recorder.record repeatedly,
	 * passing numbers starting with x and ending
	 * before y, counting by threes. For example with
	 * x=10 and y=20, it would pass Recorder.record 10, then
	 * 13, then 16, then 19.
	 * Change it so that it counts instead by 4s. I.e., in 
	 * the example above would pass 10, then 14, then 18.
	 */
	
	public static void JST_4_2_3(int x, int y){
		for (int i=x; i<y; i=i+4)
			Recorder.record(i);
	}

	/*
	 * Change this method so that it calls Recorder.record
	 * passing it x, then x+z, then x+2z, then x+3z, 
	 * continuing this way as
	 * long as the number being passed is less than y
	 */		
	public static void JST_4_2_4(int x, int y, int z){
		for (int i = 0; x + z * i<y; i++ ) {
			Recorder.record(x + z * i);
		}
	}
	
	/*
	 * This method returns an (empty) array capable
	 * of storing 4 integers. Change it so that the
	 * array is capable of storing 5 integers.
	 */		
	public static int[] JST_5_1_1(){
			int[] a = new int[5];
			return a;
	}
	
	/*
	 * Change this method so that it returns an (empty)
	 * array capable of storing 6 strings.
	 */		
	public static String[] JST_5_1_2(){
			String[] a = new String[6];
			return a;
	}
	
	/*
	 * This method returns an array capable of storing
	 * three strings. The first is initially set to
	 * "FLY", the second to "SEE", and the third to
	 * "HOP". Change the method so the second will be
	 * initially set to "RUN".
	 */		
	public static String[] JST_5_1_3(){
			String[] a = {"FLY","RUN","HOP"};
			return a;
	}
	
	/*
	 * This method sets the element of array a
	 * numbered 2 (the third element) to 6. Change
	 * it so that it instead sets the element numbered
	 * 4 (the 5th element) to 6.
	 */		
	public static int[] JST_5_2_1(int[] a){
		
		a[4]=6;
			
		return a;
	}
	
	/*
	 * Change this method so that element 1 (the second
	 * element) of array a is set to 7 and then a is
	 * returned
	 */		
	public static int[] JST_5_2_2(int[] a){
		a[1] = 7;	
		return a;
	}
	
	/*
	 * Change this method so that element in array
	 * a with index x is set to 8 and then a is 
	 * returned.
	 */		
	public static int[] JST_5_2_3(int[] a, int x){
		a[x] = 8;
		return a;
	}
	
	/*
	 * This method sets the first four elements
	 * (numbered 0 through 3) of array a to 7.
	 * Change it so that it sets the first x
	 * elements to 7.
	 */
	
	public static int[] JST_5_2_4(int[] a, int x){
		for (int i=0; i<x; i++)
			a[i]=7;
		return a;
	}
	
	/*
	 * Change this method so it changes 4 elements
	 * of a to 5, starting with the element numbered x.
	 */
	public static int[] JST_5_2_5(int[] a, int x){
		for (int i = x; i<x+4; i++)
			a[i] = 5;
		return a;
	}
	
	/*
	 * This method returns the element of a numbered
	 * 2. Change it so that it returns the element
	 * numbered 0.
	 */
	public static int JST_5_3_1(int[] a){
		return a[0];
	}
	
	/*
	 * Change this method so that it returns the
	 * element of a numbered x.
	 */
	public static int JST_5_3_2(int[] a, int x){
		return a[x];
	}
	
	/*
	 * This method sets every element of a to its index
	 * plus 3. Change it so that it changes each element
	 * to its index plus 4.
	 */
	public static int[] JST_5_3_3(int[] a){
		for (int i=0; i<a.length; i++)
			a[i]=i+4;
		return a;
	}
	
	/*
	 * This method sets every element of a to its index
	 * minus 1. Change it so that does this for each
	 * element except the last.
	 */
	public static int[] JST_5_3_4(int[] a){
		for (int i=0; i<a.length - 1; i++)
			a[i]=i-1;
		return a;
	}
	
	/*
	 * Change this method to set every element of
	 * a EXCEPT THE FIRST TWO to its index added to 2. 
	 */
	public static int[] JST_5_3_5(int[] a){
		for (int i = 2; i< a.length; i++) {
			a[i] = i+2;
		}
		return a;
	}
	
	/*
	 * This method adds 4 to every element of a.
	 * Change it so that it adds 9 to every element.
	 */
	public static int[] JST_5_3_6(int[] a){
		
		for (int i=0; i<a.length; i++)
			a[i]=a[i]+9;
		return a;
	}
	
	/*
	 * Change this method so that it multiplies every
	 * element of a by 2.
	 */
	public static int[] JST_5_3_7(int[] a){
		for (int i=0; i<a.length; i++)
			a[i]=a[i] * 2;
		return a;
	}
	
	/*
	 * This method returns the index of the first
	 * element of a that is bigger than 10. If there
	 * are no such elements, it returns 0. Change
	 * it so that it returns the first element of a
	 * that is less than 5 or 0 if none exist.
	 */
	public static int JST_5_3_8(int[] a){
		for (int i=0; i<a.length; i++)
			if (a[i]<5)
				return a[i];
		return 0;
	}
	
	/*
	 * Change this method so that it returns the
	 * first element in a that is not equal to
	 * 4, and to return 4 if no such element exists.
	 */
	public static int JST_5_3_9(int[] a){
		for(int i =0; i < a.length; i++) {
			if(a[i] != 4)
				return a[i];
		}
		return 4;
	}
	
	
	public static void main(String[] args) throws Exception
	{
		notesTestJavaTutorTesterAdd.main(args);
	}

}
