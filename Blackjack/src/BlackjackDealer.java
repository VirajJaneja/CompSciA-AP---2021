public class BlackjackDealer {	
	
	public double playBlackjack(BlackjackPlayer player, int numGames) {
		double playerScore = 0;
		for(int i = 0; i<numGames;i++) {
			blackJackHand dealerHand = new blackJackHand(true);
			blackJackHand playerHand = new blackJackHand(false);
			int j =0;
			
			while((playerHand.handValue()<=21 && dealerHand.handValue() < 21) && j == 0) {
				if(player.hit(dealerHand, playerHand) == true) {
					playerHand.addCard();
				} else {
					while(dealerHand.handValue()<17) {
						player.dealerHit(dealerHand);
						dealerHand.addCard();
					}
					j++;
				}
			}
			if(playerHand.handValue() > 21) {
				player.playerBusts(playerHand);
			} else if(dealerHand.handValue()>21) {
				playerScore++;
				player.dealerBusts(dealerHand);
			} else if (playerHand.handValue() > dealerHand.handValue()) {
				player.playerWins(playerHand, dealerHand);
				playerScore++;
			}
			else if(playerHand.handValue() == dealerHand.handValue()) {
				player.playerTies(playerHand, dealerHand);
				playerScore += .5;
				
			}
			else if (playerHand.handValue() < dealerHand.handValue())
				player.dealerWins(dealerHand, playerHand);
			
			
		}
		return playerScore/numGames;
	}
	
}
