
public class JanejaPaulMeisterKolzsar extends GreedStrategy{
	@Override
	public int choose(GreedOption[] options, int[] dice, int bank) {
		for(int i = 0; i<options.length; i++) {
			if(bank >800)
				return options.length-1;
			if((options[i].optionType() == 2))
				return i;
			if((dice.length < 3 && bank >= 200) && options[i].optionType() == 0)
				return i;
			if(bank < 200 && options[i].optionType()==1)
				return i;
		}
		return 0;
	}

	@Override
	public String playerName() {
		// TODO Auto-generated method stub
		return "Team MMAV";
	}

	@Override
	public String author() {
		// TODO Auto-generated method stub
		return "Viraj, Ayan, Martin, Merek";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
