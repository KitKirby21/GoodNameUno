import java.awt.Color;
import java.util.ArrayList;

public class UnoDeck {
	public ArrayList<UnoCard> cards = new ArrayList<UnoCard>();
	public UnoDeck() {
		Color[] cardColors = new Color[] {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW};
		
		for (Color clr : cardColors) {
			for(int i = 1; i<15; i++) {
				cards.add(new UnoCard(clr, i));
				cards.add(new UnoCard(clr, i));
			}
			cards.add(new UnoCard(clr, 0));
			
			}
		}

	public UnoDeck (int num, UnoDeck deck) {
		for (int  i = 0; i<num; i++) {
			this.pull(deck);
		}
	}
	public void add (UnoCard card) {
		cards.add(card);
	}
	public void remove (UnoCard card) {
		cards.remove(card);
	}
	public void pull(UnoDeck deck) {
		
		this.cards.add(deck.cards.remove(deck.cards.size()-1));
	}
}
