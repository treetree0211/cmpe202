import java.util.*;
import java.text.*;

public class Burger implements Component {
	public String description;
	public Double price;
	public int number;
	private ArrayList<Component> burger = new ArrayList<>();

	public Burger (String d, Double p, int i) {
		description = d;
		price = p;
		number = i;
	}

	public void printDescription() {
		DecimalFormat fmt = new DecimalFormat("0.00");
		System.out.println(number + "    " + description + "                       " + fmt.format(price));
		for (Component obj : burger) obj.printDescription();
	}

	public void addChild(Component c) {
		burger.add(c);
	}

}