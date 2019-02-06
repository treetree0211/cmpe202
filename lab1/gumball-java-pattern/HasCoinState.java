

import java.util.Random;

public class HasCoinState implements State {
	GumballMachine gumballMachine;
 
	public HasCoinState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertCoin(int coin) {
		String name = "";
		if (coin == 25) name = "quarter";
		else if (coin == 10) name = "dime";
		else name = "nickel";
		System.out.println("You insert a " + name);

		if (coin == 25) {
			gumballMachine.quarterNum++;
			gumballMachine.collectCoinSum += 25;
			
		} else {
			gumballMachine.collectCoinSum += coin;
			
		}
	}
 
	public void ejectCoin() {
		System.out.println("Coin returned");
		gumballMachine.setState(gumballMachine.getNoCoinState());
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
