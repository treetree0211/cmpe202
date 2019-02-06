

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine1 = new GumballMachine(5, 1);

		System.out.println(gumballMachine1);

		gumballMachine1.insertCoin(25);
		gumballMachine1.turnCrank();

		GumballMachine gumballMachine2 = new GumballMachine(5, 2);
		System.out.println(gumballMachine2);

		gumballMachine2.insertCoin(25);
		gumballMachine2.insertCoin(25);
		gumballMachine2.turnCrank();

		GumballMachine gumballMachine3 = new GumballMachine(5, 3);
		System.out.println(gumballMachine3);
		gumballMachine3.insertCoin(10);
		gumballMachine3.insertCoin(10);
		gumballMachine3.insertCoin(25);
		gumballMachine3.insertCoin(5);
		gumballMachine3.turnCrank();

		//one fail test
		GumballMachine gumballMachine4 = new GumballMachine(5, 3);
		System.out.println(gumballMachine4);
		gumballMachine4.insertCoin(10);
		gumballMachine4.insertCoin(10);
		gumballMachine4.insertCoin(25);
		gumballMachine4.turnCrank();
	}
}
