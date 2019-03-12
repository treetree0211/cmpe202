import java.text.*;

public class Fries implements Component {
	public String description;
	public Double price;
	public int number;

	public Fries (String d, Double p, int i) {
		description = d;
		price = p;
		number = i;
	}

	public void printDescription() {
		DecimalFormat fmt = new DecimalFormat("0.00");
		System.out.println(number + "    " + description + "                   " + fmt.format(price));
	}

	public void addChild(Component c) {
		
	}

}