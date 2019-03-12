import java.io.*;
import java.text.*;

public class main {
	public static void main(String[] args) {
		String packing = "";
		String time = " 12/1/2016 1:46:54 PM";
		storeInfo(time); 
		Order theOrder = new Order();
		Burger customizedBurger = new Burger("LBB", 5.59, 1);
		Buttoms bot = new Buttoms("BACON");
		Toppings top1 = new Toppings("LETTUCE");
		Toppings top2 = new Toppings("TOMATO");
		Meat meat1 = new Meat("G ONION");
		Meat meat2 = new Meat("JALA Grilled");

		customizedBurger.addChild(bot);
		customizedBurger.addChild(top1);
		customizedBurger.addChild(top2);
		customizedBurger.addChild(meat1);
		customizedBurger.addChild(meat2);
	
		packing += customizedBurger.number + "#";
		packing += customizedBurger.description + "#";
		packing += top1.description + "#";
		packing += top2.description + "#";
		packing += "->|" + meat1.description + "#";
		packing += "->|" + meat2.description + "#";
		packing += "{{{{ " + bot.description + " }}}}" + "#";

		Fries fries = new Fries("LTL CAJ", 2.79, 1);

		packing += fries.number + "#";
		packing += fries.description + "#";

		theOrder.addChild(customizedBurger);
		theOrder.addChild(fries);
		theOrder.printDescription();
		double cost = customizedBurger.price + fries.price;
		orderPrice(cost, 20.00);
		receiptFoot();
		printPacking(packing, time);
	}

	public static void printPacking(String packing, String time) {
		String[] details = packing.split("#");

		String display = "Patties - " + details[0]+ "\n\n\n";
		display += "Order Number: 45\n";
		display += "         " + time + "\n\n";
		display += "            FIVE GUYS\n\n";
		display += "Sandwich#  " + details[0] + "\n";
		display += details[0] + "    " + details[1] + "\n";
		for (int i = 2; i <= 6; i++) display += "      " + details[i] + "\n";
		display += details[7] + "    " + details[8];
		System.out.println(display);
		System.out.println("Register:1       Tran Seq No:    57845");
		System.out.println("Cashier:Sakda* S.");
	}

	public static void orderPrice(double cost, double cash) {
		DecimalFormat fmt = new DecimalFormat("0.00");
		double taxRate = 0.09;
		double totalTax = cost * taxRate;

		System.out.println("  Sub. Total:                  $" + fmt.format(cost) );
		System.out.println("  Tax:                         $"+ fmt.format(totalTax) );
		System.out.println("  Total:                       $"+ fmt.format(totalTax + cost) );
		System.out.println("  Cash $" + cash + "                   $" +  fmt.format(cash) ); 
		System.out.println("  Change                       $" +  fmt.format(cash - totalTax - cost) );           
		System.out.println("Register:1       Tran Seq No:    57845");
		System.out.println("Cashier:Sakda* S.");
	}

	public static void receiptFoot() {
		System.out.println("  ***********************************");
		System.out.println("    Don't thow away your receipt!!!");
		System.out.println("   Help Five Guys and you could win!\n");

	}

	public static void storeInfo(String time) {
		String display = "";
		display += "                FIVE GUYS \n";
		display += "            BURGERS AND FRIES\n";
		display += "             STORE # CA-1294\n";
		display += "          5353 ALMADEN EXPY N60\n";
		display += "            SAN JOSE, CA 95118\n";
		display += "             (P) 408-264-9300\n\n\n";
		display += "          " + time + "\n\n";
		display += "              FIVE GUYS \n";
		display += "Order Number: 45\n";
		System.out.println(display);
	}
}