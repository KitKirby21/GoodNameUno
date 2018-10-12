import java.util.Collections;

public class UnoClass {
	public static void main(String[] args) {
		UnoDeck generalDeck = new UnoDeck();
		Collections.shuffle(generalDeck.cards);
		UnoPlayer bot1 = new UnoBot();
		UnoPlayer player1 = new UnoHuman();
		UnoPlayer[] allplayers = {player1, bot1};
		
		if (index >= allplayers.) {index = 0;}
		UnoDeck botHand = new UnoDeck(7, generalDeck);
		UnoDeck playerHand = new UnoDeck(7, generalDeck);
		UnoDeck cfu = new UnoDeck(1, generalDeck);
		while (botHand.cards.size() > 0 && playerHand.cards.size() > 0) {
			UnoCard card = (botHand, cfu.cards.get(cfu.cards.size()-1), generalDeck);
			if(!(card==null)) {
				cfu.add(card);
				botHand.remove(card);
				if(card.number()==UnoCard.SKIP_CARD) {
					UnoCard carda = bot1(botHand, cfu.cards.get(cfu.cards.size()-1), generalDeck);
					cfu.add(carda);
					botHand.remove(carda);
				}
				if(card.number()==12) {
					playerHand.pull(generalDeck);
					playerHand.pull(generalDeck);
					UnoCard carda = botTurn(botHand, cfu.cards.get(cfu.cards.size()-1), generalDeck);
					cfu.add(carda);
					botHand.remove(carda);
				}
				if(card.number()==14) {
					playerHand.pull(generalDeck);
					playerHand.pull(generalDeck);
					playerHand.pull(generalDeck);
					playerHand.pull(generalDeck);
					UnoCard carda = botTurn(botHand, cfu.cards.get(cfu.cards.size()-1), generalDeck);
					cfu.add(carda);
					botHand.remove(carda);
				}
			}
			
			UnoCard card1 = PlayerTurn(playerHand, cfu.cards.get(cfu.cards.size()-1), generalDeck);
			if(!(card1==null)) {

			cfu.add(card1);
			playerHand.remove(card1);
			if(card1.number()==10) {
				UnoCard cardb = PlayerTurn(playerHand, cfu.cards.get(cfu.cards.size()-1), generalDeck);
				cfu.add(cardb);
				playerHand.remove(cardb);
			}
			if(card1.number()==12) {
				botHand.pull(generalDeck);
				botHand.pull(generalDeck);
				UnoCard cardb = PlayerTurn(playerHand, cfu.cards.get(cfu.cards.size()-1), generalDeck);
				cfu.add(cardb);
				playerHand.remove(cardb);
			}
			if(card1.number()==14) {
				botHand.pull(generalDeck);
				botHand.pull(generalDeck);
				botHand.pull(generalDeck);
				botHand.pull(generalDeck);
				UnoCard cardb = PlayerTurn(playerHand, cfu.cards.get(cfu.cards.size()-1), generalDeck);
				cfu.add(cardb);
				playerHand.remove(cardb);
			}
		}
	}
		if (botHand.cards.size() == 0) {
			System.out.println("You lose");
		}
		else {
			System.out.println("You win");
		}
	}
}

