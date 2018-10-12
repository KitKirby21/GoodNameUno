
public class UnoBot implements UnoPlayer {
	public UnoCard pickCard(UnoDeck gD, UnoCard cardFU, UnoDeck deck) {
		for (int i = 0; i<deck.cards.size()-1; i++) {
			UnoCard card = deck.cards.get(i);
			if(card.color().equals(cardFU.color())
					|| card.number() == cardFU.number()
					|| card.number()==13||card.number()==14) {
				return card;
			}
		}
		deck.pull(gD);
		if(deck.cards.get(deck.cards.size()-1).color().equals(cardFU.color())
				|| deck.cards.get(deck.cards.size()-1).number() == cardFU.number()
				|| deck.cards.get(deck.cards.size()-1).number() == 13
				|| deck.cards.get(deck.cards.size()-1).number() == 14) {
			return deck.cards.get(deck.cards.size()-1);
		}
		else {
			return null;
		}
	}
}

