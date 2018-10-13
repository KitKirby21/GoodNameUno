
public interface UnoPlayer {
	
	//pick a card (either bot or player), and return the picked card (or null)
	public UnoCard pickCard (UnoDeck gD, UnoDeck cardsFU);
	
	//draw a card, and return if you can play again
	public boolean drawCard (UnoDeck gD, UnoDeck cardsFU);
	
	//take a card into the hand
	public void takeCard(UnoCard card);
	
}
