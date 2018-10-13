
public class UnoBot implements UnoPlayer {
	
	private UnoDeck hand;
	
	public UnoBot(UnoDeck hand) {
		this.hand = hand;
	}
	
	public UnoCard pickCard(UnoDeck gD, UnoDeck cardsFU) {
		for (int i = 0; i<this.hand.cards.size(); i++) {
			UnoCard card = this.hand.cards.get(i);
			if(card.canPlace(cardsFU.peek())) {
				return card;
			}
		}
		
		return null;
	}

	@Override
	public boolean drawCard(UnoDeck gD, UnoDeck cardsFU) {
		UnoCard newCard = gD.pop();
		
		if(newCard.canPlace(cardsFU.peek())) {
			cardsFU.add(newCard);
			return false;
		} else {
			hand.add(newCard);
			return false;
		}
	}

	@Override
	public void takeCard(UnoCard card) {
		hand.add(card);
	}
}

