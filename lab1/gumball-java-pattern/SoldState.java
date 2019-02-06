

public class SoldState implements State {
 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
	public void insertCoin(int coin) {
		System.out.println("Please wait, we're already giving you a gumball");
	}
 
	public void ejectCoin() {
		System.out.println("Sorry, you already turned the crank");
	}
 
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball!");
	}
 
	public void dispense() {
		if (gumballMachine.getCount() > 0) {
			int machineType = gumballMachine.type;
			if (machineType == 1 && gumballMachine.quarterNum == 1) {
				gumballMachine.releaseBall();
				gumballMachine.setState(gumballMachine.getNoCoinState());
			} else if (machineType == 2 && gumballMachine.quarterNum == 2) {
				gumballMachine.releaseBall();
				gumballMachine.setState(gumballMachine.getNoCoinState());
			} else if (gumballMachine.collectCoinSum == gumballMachine.cost) {
				gumballMachine.releaseBall();
				gumballMachine.setState(gumballMachine.getNoCoinState());
			} else {
				System.out.println("You need more coins");
			}
			
		} else {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
 
	public String toString() {
		return "dispensing a gumball";
	}
}


