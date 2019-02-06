

public class NoCoinState implements State {
    GumballMachine gumballMachine;
 
    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
        gumballMachine.quarterNum = 0;
        gumballMachine.collectCoinSum = 0;
    }
 
	public void insertCoin(int coin) {
		//System.out.println("You inserted a coin");
			
		int type = gumballMachine.type;
		if (type == 1) System.out.println("This gumball needs a quarter! Please insert a quarter!");
		else if (type == 2) System.out.println("This gumball needs 2 quarters! Please insert 2 quarters!");
		else System.out.println("This gumball needs 50 cents! Please insert a coin!");

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

		gumballMachine.setState(gumballMachine.getHasCoinState());
		
	}
 
	public void ejectCoin() {
		System.out.println("You haven't inserted a coin");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no coin");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for coin";
	}
}
