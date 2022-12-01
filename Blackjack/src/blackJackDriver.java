
public class blackJackDriver {

	public static void main(String[] args) {
		blackJackDriver6();
		
		
	}
	
	public static void blackJackDriver1() {
		PlayingCard RandomCard1 = new PlayingCard();
		System.out.println(RandomCard1.toString());
		
		PlayingCard RandomCard2 = new PlayingCard();
		System.out.println(RandomCard2.toString());
		RandomCard2.setRandom(false);

		
		PlayingCard RandomCard3 = new PlayingCard();
		System.out.println(RandomCard3.toString());
		
		PlayingCard RandomCard4 = new PlayingCard();
		System.out.println(RandomCard4.toString());
		RandomCard4.setRandom(true);
		
		PlayingCard RandomCard5 = new PlayingCard();
		System.out.println(RandomCard5.toString());
		
		PlayingCard RandomCard6 = new PlayingCard();
		System.out.println(RandomCard6.toString());
		
		PlayingCard Card1 = new PlayingCard(PlayingCard.HEARTS, 1);
		System.out.println(Card1.toString());
		
		PlayingCard Card2 = new PlayingCard(PlayingCard.CLUBS, 2);
		System.out.println(Card2.toString());
		
		PlayingCard Card3 = new PlayingCard(PlayingCard.DIAMONDS, 3);
		System.out.println(Card3.toString());
		
		PlayingCard Card4 = new PlayingCard(PlayingCard.SPADES, 4);
		System.out.println(Card4.toString());
		
		PlayingCard Card5 = new PlayingCard(PlayingCard.HEARTS, 5);
		System.out.println(Card5.toString());
		
		PlayingCard Card6 = new PlayingCard(PlayingCard.CLUBS, 6);
		System.out.println(Card6.toString());
		
		PlayingCard Card7 = new PlayingCard(PlayingCard.DIAMONDS, 7);
		System.out.println(Card7.toString());
		
		PlayingCard Card8 = new PlayingCard(PlayingCard.SPADES, 8);
		System.out.println(Card8.toString());
		
		PlayingCard Card9 = new PlayingCard(PlayingCard.HEARTS, 9);
		System.out.println(Card9.toString());
		
		PlayingCard Card10 = new PlayingCard(PlayingCard.CLUBS, 10);
		System.out.println(Card10.toString());
		
		PlayingCard Card11 = new PlayingCard(PlayingCard.DIAMONDS, PlayingCard.JACK);
		System.out.println(Card11.toString());
		
		PlayingCard Card12 = new PlayingCard(PlayingCard.SPADES, PlayingCard.QUEEN);
		System.out.println(Card12.toString());
		
		PlayingCard Card13 = new PlayingCard(PlayingCard.HEARTS, PlayingCard.KING);
		System.out.println(Card13.toString());
	}

	public static void blackJackDriver2() {
		Hand Hand1 = new Hand(0);
		Hand Hand2 = new Hand(1);
		Hand Hand3 = new Hand(2);
		Hand Hand4 = new Hand(5);
		
		System.out.println(Hand1.numberOfCards());
		System.out.println(Hand2.numberOfCards());
		System.out.println(Hand3.numberOfCards());

		System.out.println();
		
		System.out.println(Hand2.nthCard(0));
		
		System.out.println(Hand3.nthCard(0));
		System.out.println(Hand3.nthCard(1));
		
		System.out.println(Hand4.nthCard(0));
		System.out.println(Hand4.nthCard(4));
		System.out.println(Hand4.nthCard(2));
		
		System.out.println("");
		Hand1.print();
		Hand2.print();
		Hand4.print();
	}
	
	public static void blackJackDriver3() {
		PlayingCard two = new PlayingCard(2, 2);
		PlayingCard three = new PlayingCard(3, 3);
		PlayingCard four = new PlayingCard(4, 4);
		PlayingCard five = new PlayingCard(1, 5);
		PlayingCard six = new PlayingCard(2, 6);
		PlayingCard seven = new PlayingCard(3, 7);
		PlayingCard eight = new PlayingCard(4, 8);
		PlayingCard nine = new PlayingCard(1, 9);
		PlayingCard ten = new PlayingCard(2, 10);
		PlayingCard queen = new PlayingCard(3, 12);
		PlayingCard king = new PlayingCard(4, 13);
		PlayingCard jack = new PlayingCard(1, 11);
		PlayingCard ace = new PlayingCard(1, 1);

		
		blackJackHand Hand1 = new blackJackHand();
		Hand1.addCard(queen);
		Hand1.addCard(king);
		Hand1.addCard(jack);
		Hand1.print();
		System.out.println(Hand1.handValue);
		System.out.println();
		
		blackJackHand Hand2 = new blackJackHand();
		Hand2.addCard(ace);
		Hand2.addCard(ace);
		Hand2.print();
		System.out.println(Hand2.handValue);
		System.out.println();
		
		blackJackHand Hand3 = new blackJackHand();
		Hand3.addCard(king);
		Hand3.addCard(two);
		Hand3.addCard(ace);
		Hand3.print();
		System.out.println(Hand3.handValue);
		System.out.println();

		blackJackHand Hand4 = new blackJackHand();
		Hand4.addCard(two);
		Hand4.addCard(ace);
		Hand4.print();
		System.out.println(Hand4.handValue);
		System.out.println();
		
		blackJackHand Hand5 = new blackJackHand();
		Hand5.addCard(two);
		Hand5.addCard(two);
		Hand5.addCard(two);
		Hand5.addCard(two);
		Hand5.addCard(ace);
		Hand5.print();
		System.out.println(Hand5.handValue);
		System.out.println();
		
		blackJackHand Hand6 = new blackJackHand();
		Hand6.addCard(king);
		Hand6.addCard(ace);
		Hand6.print();
		System.out.println(Hand6.handValue);
		System.out.println();
		
		blackJackHand Hand7 = new blackJackHand();
		Hand7.addCard(ace);
		Hand7.addCard(seven);
		Hand7.addCard(four);
		Hand7.print();
		System.out.println(Hand7.handValue);
		System.out.println();
		
		blackJackHand Hand8 = new blackJackHand();
		Hand8.addCard(ace);
		Hand8.addCard(seven);
		Hand8.print();
		System.out.println(Hand8.handValue);
		System.out.println();
		
		blackJackHand Hand9 = new blackJackHand();
		Hand9.addCard(four);
		Hand9.addCard(seven);
		Hand9.addCard(ace);
		Hand9.print();
		System.out.println(Hand9.handValue);
		System.out.println();
		
		blackJackHand Hand10 = new blackJackHand();
		Hand10.addCard(seven);
		Hand10.addCard(ace);
		Hand10.print();
		System.out.println(Hand10.handValue);
		System.out.println();
		
		blackJackHand Hand11 = new blackJackHand();
		Hand11.addCard(seven);
		Hand11.addCard(two);
		Hand11.print();
		System.out.println(Hand11.handValue);
		System.out.println();
		
		blackJackHand Hand12 = new blackJackHand();
		Hand12.addCard(ace);
		Hand12.addCard(king);
		Hand12.addCard(two);
		Hand12.print();
		System.out.println(Hand12.handValue);
		System.out.println();
	}
	
	public static void blackJackDriver4() {
		HumanBlackjackPlayer player = new HumanBlackjackPlayer();
		blackJackHand dealerHand = new blackJackHand(true);
		blackJackHand playerHand = new blackJackHand(false);
		System.out.println(player.hit(dealerHand, playerHand));
		System.out.println();

		player.dealerHit(dealerHand);
		
		System.out.println();
		
		player.playerBusts(playerHand);
		player.playerTies(playerHand, dealerHand);
		player.playerWins(playerHand, dealerHand);
		player.dealerBusts(dealerHand);
		player.dealerWins(dealerHand, playerHand);
	}
	
	public static void blackJackDriver6() {
		BlackjackDealer dealer = new BlackjackDealer();
		HumanBlackjackPlayer player = new HumanBlackjackPlayer();
		BlackjackStrategy strat = new JanejaVirajStrategy();
		BlackjackPlayer comp = new ComputerBlackjackPlayer(strat);
		//BlackjackDealer();
		for(int i = 0; i<10; i++) {
			System.out.println(dealer.playBlackjack(comp, 1000));
		}
	}
}
