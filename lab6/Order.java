import java.util.*;

public class Order implements Component {
	private ArrayList<Component> components = new ArrayList<>();
	//private String description;

	public Order () {
		//description = d;
	}

	public void printDescription() {
		//System.out.println(description);
		for (Component obj : components) obj.printDescription();
	}

	public void addChild(Component c) {
		components.add(c);
	}

}