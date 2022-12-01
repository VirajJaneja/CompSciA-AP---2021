import java.util.*;

public class Madlib {
	public static void main(String str[]) {
		//storyLineDriver();
		//wordInsideBracketsDriver();
		//replaceQueryDriver();
		String x[]= new String[]{"My name is <name>, though you may call me <shorter name>.",
				"I was taking a stroll yesterday when a floating <object> appeared before me and spoke, demanding a toll.",
				"After paying with a <item> I went on my way, relieved but unhappy before finally reaching home.",
				"Much to my dismay however, I found my <large object> had been torn apart.",
				"Before tidying it up, a thought <past verb> my mind. Could the two <adjective> events be related?"};
		playMadlibs(x);
		
	}
	
	public static String substituteWord(String a, String b) {
		int StringBegin = a.indexOf("<");
		int StringEnd = a.indexOf(">");
		String c = a.substring(0, StringBegin) + b + a.substring(StringEnd + 1);
		return c;
	}
	
	public static String wordInsideBrackets(String a) {
		int StringBegin = a.indexOf("<");
		int StringEnd = a.indexOf(">");
		if (StringBegin == -1) {
			return "";
		}
		else {
			String c = a.substring(StringBegin +1, StringEnd);
			return c;
		}
	}
	
	public static String inputString() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	public static String queryReplace(String a) {
		String enclosedWord;
		String input;
		String firstLetter;
		while(a.indexOf("<") != -1) {
			enclosedWord = wordInsideBrackets(a);
			firstLetter = enclosedWord.substring(0,1);
			if (firstLetter.equalsIgnoreCase("a") || firstLetter.equalsIgnoreCase("e") || firstLetter.equalsIgnoreCase("i") || firstLetter.equalsIgnoreCase("o") || firstLetter.equalsIgnoreCase("u")){
				System.out.print("Enter an " + enclosedWord + ": ");
				
			} else
				System.out.print("Enter a " + enclosedWord + ": ");
			input = inputString();
			firstLetter = enclosedWord.substring(1);
			
			a = substituteWord(a, input);
		}		
		return a;
		
	}
	
	public static void playMadlibs(String[] array) {
		System.out.println("Welcome to MadLibs. Game was created by Viraj J.");
		String story = "";
		for(int i = 0; i < array.length; i++) {
			story = story + "\n" + queryReplace(array[i]);
			
		}
		System.out.println(story);
	}
	
	public static void replaceQueryDriver() {
		System.out.println("replaceQueryDriver");
		System.out.println("-------------------------");
		
		
		System.out.println("Storyline: " + "Srikar went to the store");
		System.out.println(queryReplace("Srikar went to the store"));
		System.out.print("\n");
		
		System.out.println("Storyline: " + "<name> went to play genshin");
		System.out.println(queryReplace("<name> went to play genshin"));
		System.out.print("\n");
		
		System.out.println("Storyline: " + "Raj went to play <sport>");
		System.out.println(queryReplace("Raj went to play <sport>"));
		System.out.print("\n");
		
		System.out.println("Storyline: " + "Ayan wanted to <verb activity> but <past tense activity> instead");
		System.out.println(queryReplace("Ayan wanted to <verb activity> but <past tense activity> instead"));
		System.out.print("\n");
		
		System.out.println("Storyline: " + "Garrett had <subect, sport, and a club>");
		System.out.println(queryReplace("Garrett had <subject, sport and a club>"));
		System.out.print("\n");
		
		System.out.println("Storyline: " + "Charlotte lost her <sport game><score>");
		System.out.println(queryReplace("Charlotte lost her <sport game><score>"));
		System.out.print("\n");
		
		System.out.println("Storyline: " + "<animal> ate dinner");
		System.out.println(queryReplace("<animal> ate dinner"));
		System.out.print("\n");
		
		System.out.println("Storyline: " + "number to <exponent> is ____?");
		System.out.println(queryReplace("number to <exponent> is ____?"));
		System.out.print("\n");
		
		System.out.println("Storyline: " + "my badge number is <identification>");
		System.out.println(queryReplace("my badge number is <identification>"));
		System.out.print("\n");
		
		System.out.println("Storyline: " + "here hold this <object> for me");
		System.out.println(queryReplace("here hold this <object> for me"));
		System.out.print("\n");
		
		System.out.println("Storyline: " + "the uppercut angle is <uppercut angle> degrees");
		System.out.println(queryReplace("the uppercut angle is <uppercut angle> degrees"));
		System.out.print("\n");
		
		System.out.println("Storyline: " + "testing the <z>");
		System.out.println(queryReplace("testing the <z>"));
		System.out.print("\n");
	}
	
	/*public static void substituteWordDriver() {
		System.out.println("substituteWordDriver");
		System.out.println("-------------------------");
		
		System.out.println("Storyline: " + "<replace> hi");
		System.out.println("word: " + "hello");
		System.out.println(substituteWord("<replace> hi", "hello"));
		System.out.println();
		System.out.print("\n");
		
		System.out.println("Storyline: " + "hi <replace>");
		System.out.println("word: " + "hello");
		System.out.println(substituteWord("hi <replace>", "hello"));
		System.out.print("\n");
		
		System.out.println("Storyline: " + "hi2 <replace> but hi again");
		System.out.println("word: " + "hello2");
		System.out.println(substituteWord("hi2 <replace> but hi again", "hello2"));
		System.out.print("\n");

		System.out.println("Storyline: " + "I like both <animals> ");
		System.out.println("word: " + "cat and dog");
		System.out.println(substituteWord("I like both <animals> ", "cat and dog"));
		System.out.print("\n");
		
		System.out.println("Storyline: " + "I like both <two foods> ");
		System.out.println("word: " + "apples and oranges");
		System.out.println(substituteWord("I like both <two foods> ", "apples and oranges"));
		System.out.print("\n");
		
		System.out.println("Storyline: " + "the <animal> walked over to the <area> and <verb>");
		System.out.println("word: " + "dog");
		System.out.println(substituteWord("the <animal> walked over to the <area> and <verb>", "dog"));
		System.out.print("\n");
		
		System.out.println("Storyline: " + "yesterday for lunch I ate a <food>, and the day before that <food>");
		System.out.println("word: " + "apple");
		System.out.println(substituteWord("yesterday for lunch I ate a <food>, and the day before that <food>", "apple"));
		System.out.print("\n");
		
		System.out.println("Storyline: " + "I have <Amount of $> dollars");
		System.out.println("word: " + "14");
		System.out.println(substituteWord("I have <Amount of $> dollars", "14"));
		System.out.print("\n");
		
	}
	*/
	
	public static void wordInsideBracketsDriver() {
		System.out.println("wordInsideBracketsDriver");
		System.out.println("-------------------------");
		
		System.out.println("Storyline: " + "<replace> hi");
		System.out.println(wordInsideBrackets("<replace> hi"));
		System.out.println();
		System.out.print("\n");
		
		System.out.println("Storyline: " + "hi <replace>");
		System.out.println(wordInsideBrackets("hi <replace>"));
		System.out.print("\n");
		
		System.out.println("Storyline: " + "hi2 <replace> but hi again");
		System.out.println(wordInsideBrackets("hi2 <replace> but hi again"));
		System.out.print("\n");

		System.out.println("Storyline: " + "I like both <animals> ");
		System.out.println(wordInsideBrackets("I like both <animals> "));
		System.out.print("\n");
		
		System.out.println("Storyline: " + "I like both <two foods> ");
		System.out.println(wordInsideBrackets("I like both <two foods> "));
		System.out.print("\n");
		
		System.out.println("Storyline: " + "the <animal> walked over to the <area> and <verb>");
		System.out.println(wordInsideBrackets("the <animal> walked over to the <area> and <verb>"));
		System.out.print("\n");
		
		System.out.println("Storyline: " + "yesterday for lunch I ate a <food>, and the day before that <food>");
		System.out.println(wordInsideBrackets("yesterday for lunch I ate a <food>, and the day before that <food>"));
		System.out.print("\n");
		
		System.out.println("Storyline: " + "I have <Amount of $> dollars");
		System.out.println(wordInsideBrackets("I have <Amount of $> dollars"));
		System.out.print("\n");
		
		System.out.println("Storyline: " + "");
		System.out.println(wordInsideBrackets(""));
		System.out.print("\n");
		
	}
}
