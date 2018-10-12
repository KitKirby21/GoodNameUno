import java.util.Scanner;

public class UnoHuman implements UnoPlayer {
	public UnoCard pickCard(UnoDeck deck, UnoCard cardFU, UnoDeck gD) {
		while (true){
			System.out.println("The cFU is " + cardFU + 
				"\nYour cards are " + deck.cards + 
				"\nEnter the index of the card you want to play loser, or press -1 if u dont have one bcse ur bad at the friggin game");
			Scanner input = new Scanner(System.in);
			int index = input.nextInt();
			if(index == -1)
				{deck.pull(gD);
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
			else if(deck.cards.get(index).color().equals(cardFU.color()) 
					|| deck.cards.get(index).number() == cardFU.number()
					|| deck.cards.get(index).number() == 13
					|| deck.cards.get(index).number() == 14) {
				return deck.cards.get(index);
			}
		}
	}
}