import java.util.Collections;

public class UnoClass {
	
	public static UnoPlayer[] allPlayers;
	public static int currentPlayer = 0;	
	public static int direction = 1;
	private static UnoDeck generalDeck = new UnoDeck();
	private static UnoDeck cfu;
	
	public static void main(String[] args) {
		
		int nBots = 2;
		allPlayers = new UnoPlayer[nBots+1];
		
		Collections.shuffle(generalDeck.cards);
		
		for (int i = 1; i < nBots+1; i++) {
			allPlayers[i] = new UnoBot(new UnoDeck(7, generalDeck));
		}
		allPlayers[0] = new UnoHuman(new UnoDeck(7, generalDeck));
		
		cfu = new UnoDeck(1, generalDeck);

		while (true) {
			
			UnoCard pickedCard = allPlayers[currentPlayer].pickCard(generalDeck, cfu);
			if (pickedCard == null) {
				allPlayers[currentPlayer].drawCard(generalDeck, cfu);
			} else {
				cfu.add(pickedCard);
			}
			
		}
		
	}
	
	private static UnoPlayer nextPlayer() {
		int i = currentPlayer + direction;
		if (i >= allPlayers.length) {
			i = 0;
		}
		if (i < 0) {
			i = allPlayers.length-1;
		}
		
		return allPlayers[i];
	}
	
	public static void giveNextPlayerCard(UnoCard card) {
		
		nextPlayer().takeCard(card);
		
	}
	
	public static void doSpecialAction(UnoCard card) {
		
		if (card.number() == UnoCard.SKIP_CARD) {
			currentPlayer += direction;
		} else if (card.number() == UnoCard.REVERSE_CARD) {
			direction *= -1;
		} else if (card.number() == UnoCard.DRAW_2_CARD) {
			giveNextPlayerCard(generalDeck.pop());
			giveNextPlayerCard(generalDeck.pop());
		} else if (card.number() == UnoCard.DRAW_4_CARD) {
			giveNextPlayerCard(generalDeck.pop());
			giveNextPlayerCard(generalDeck.pop());
			giveNextPlayerCard(generalDeck.pop());
			giveNextPlayerCard(generalDeck.pop());
		}
		
	}
}

