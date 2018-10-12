import java.awt.Color;

public class UnoCard {
	public final static int SKIP_CARD = 10;
	
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
	
	public String toString() {
		
//		String cardType = "Skip-";
//		String cardColor = "Blue";

		if(this.color().equals(Color.BLUE)) {

			if(number==10)
			return "Skip-" + "Blue";
		else if(number==11)
			return "Reverse-" + "Blue";
		else if (number==12)
			return "Draw 2-" + "Blue";
		else if (number== 13)
			return "Color Change-" + "Blue";
		else if (number == 14)
			return "Draw 4-" + "Blue";
		else return (number +"-") + "Blue";}
		
		else if(this.color().equals(Color.RED)) {

			if(number==10)
				return "Skip-" + "Red";
			else if(number==11)
				return "Reverse-" + "Red";
			else if (number==12)
				return "Draw 2-" + "Red";
			else if (number== 13)
				return "Color Change-" + "Red";
			else if (number == 14)
				return "Draw 4-" + "Red";
			else return (number +"-") + "Red";}
		
		else if(this.color().equals(Color.GREEN)) {

			if(number==10)
				return "Skip-" + "Green";
			else if(number==11)
				return "Reverse-" + "Green";
			else if (number==12)
				return "Draw 2-" + "Green";
			else if (number== 13)
				return "Color Change-" + "Green";
			else if (number == 14)
				return "Draw 4-" + "Green";
			else return (number +"-") + "Green";}
		
		else {

			if(number==10)
				return "Skip-" + "Yellow";
			else if(number==11)
				return "Reverse-" + "Yellow";
			else if (number==12)
				return "Draw 2-" + "Yellow";
			else if (number== 13)
				return "Color Change-" + "Yellow";
			else if (number == 14)
				return "Draw 4-" + "Yellow";
			else return (number +"-") + "Yellow";}
	}
}
