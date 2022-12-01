package intro2;
import java.util.*;

public class HappyBirthday {
	public static void main(String str[]) {
		System.out.print("Enter your name: " );
		String name = inputString();
		for(int i = 0; i<4; i++) {
			if(i != 2)
				System.out.println("Happy Birthday to you.");
			else {
				System.out.println("Happy birthday dear " + name +",");
			}
		}
	}
	//Input a line from the keyboard, return as string.
	public static String inputString() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
}