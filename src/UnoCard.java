import java.awt.Color;

public class UnoCard {
	public final static int SKIP_CARD = 10;
	public final static int REVERSE_CARD = 11;
	public final static int DRAW_2_CARD = 12;
	public final static int DRAW_4_CARD = 14;
	public final static int CHANGE_COLOR_CARD = 13;
	
	private int number;
	private Color color;
	
	public UnoCard (Color c, int n) {
		color = c;
		number = n;
	}
	public Color color() {
		return this.color;
	}
	
	public int number() {
		return this.number;
	}
	
	/**
	 * Check if this card can be placed on onther
	 * 
	 * @param other
	 * @return true if can be placed
	 */
	public boolean canPlace(UnoCard other) {
		return (other.color().equals(this.color()) 
				|| other.number() == this.number()
				|| this.number() == CHANGE_COLOR_CARD
				|| this.number() == DRAW_4_CARD);
	}
	
	public String toString() {
		
		String cardType;
		String cardColor;
		
		if(number==10) {
			cardType = "Skip-";
		} else if(number==11) {
			cardType = "Reverse-";
		} else if (number==12) {
			cardType = "Draw 2-";
		} else if (number== 13) {
			cardType = "Color Change-";
		} else if (number == 14) {
			cardType = "Draw 4-";
		} else {
			cardType = number + "-";
		}
		
		if(this.color().equals(Color.BLUE)) {
			cardColor = "Blue";
		} else if(this.color().equals(Color.RED)) {
			cardColor = "Red";
		} else if(this.color().equals(Color.GREEN)) {
			cardColor = "Green";
		} else {
			cardColor = "Yellow";
		}
		
		return cardType+cardColor;

	}
}
