import java.util.Scanner;

public class UnoHuman implements UnoPlayer {
	
	private UnoDeck hand;
	
	public UnoHuman(UnoDeck hand) {
		this.hand = hand;
	}
	
	public UnoCard pickCard(UnoDeck gD, UnoDeck cardsFU) {
		UnoCard card = null;
		Scanner input = new Scanner(System.in);
		while (true){
			System.out.println("The cFU is " + cardsFU.peek() + 
				"\nYour cards are " + this.hand.cards + 
				"\nEnter the index of the card you want to play loser, or press -1 if u dont have one bcse ur bad at the friggin game");
			int index = input.nextInt();
			if(index == -1) {
				break;
			}  else {
				UnoCard chosen = hand.cards.get(index);
				if (chosen.canPlace(cardsFU.peek())) {
					hand.remove(chosen);
					card = chosen;
					break;
				}
			}
		}
		input.close();
		return card;
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