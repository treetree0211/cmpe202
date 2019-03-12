public class Toppings implements Component {
	public String description;
	//private Double price;

	public Toppings (String d) {
		description = d;
		//price = p;
	}

	public void printDescription() {
		//DecimalFormat fmt = new DecimalFormat("0.00");
		System.out.println("     " + description);
	}

	public void addChild(Component c) {
		
	}

}