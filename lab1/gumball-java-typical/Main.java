

public class Main {

	public static void main(String[] args) {
		// initialize type 1 machine and insert 1 quarter
		GumballMachine gumballMachine1 = new GumballMachine(5, 1);

		System.out.println(gumballMachine1);

		gumballMachine1.insertCoin( 25 );
		gumballMachine1.turnCrank();

		System.out.println(gumballMachine1);

		gumballMachine1.insertCoin( 25 );
		gumballMachine1.turnCrank();
		gumballMachine1.insertCoin( 25 );
		gumballMachine1.turnCrank();

		// initialize type 2 machine and insert 2 quarter
		GumballMachine gumballMachine2 = new GumballMachine(5, 2);
		System.out.println(gumballMachine2);
		gumballMachine2.insertCoin( 25 );
		gumballMachine2.insertCoin( 25 );
		gumballMachine2.turnCrank();

		System.out.println(gumballMachine2);
		// test a failed case : we can not get a gumball 
		gumballMachine2.insertCoin( 25 );
		gumballMachine2.insertCoin( 10 );
		gumballMachine2.turnCrank();

		// initialize type 3 machine and insert different coins
		GumballMachine gumballMachine3 = new GumballMachine(5, 3);
		System.out.println(gumballMachine3);
		gumballMachine3.insertCoin( 10 );
		gumballMachine3.insertCoin( 5 );
		gumballMachine3.insertCoin( 25 );
		gumballMachine3.insertCoin( 10 );
		gumballMachine3.turnCrank();

	}
}
