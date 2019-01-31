
public class GumballMachine
{

    private int num_gumballs;
    //private boolean has_quarter;
    // Add quarter number to record how many quarters inserted
    private int quarterNum;
    // Add cost and type for different machines
    private int cost;
    private int type;
    // Add current get coin sum
    private int collectCoinSum;


    // Add type number to distinguish machine type
    /* Type 1 : accept only quarters;
       Type 2 : accept two quarters;
       Type 3 : accept all coins;
    */
    public GumballMachine( int size, int type)
    {
        // initialise instance variables
        this.num_gumballs = size;
        //this.has_quarter = false;
        this.type = type;
        this.collectCoinSum = 0;
        this.quarterNum = 0;
        if (this.type == 1) this.cost = 25;
        else {
          this.cost = 50; 
        }
    }

    // check if quarter or other coin inserted
    public void insertCoin(int coin)
    {
        //check if contains one or two quarter
        if ( coin == 25 ) this.quarterNum++;

        this.collectCoinSum += coin;
    }

    public int getCoinSum() {
        return this.collectCoinSum;
    }
    
    public void turnCrank()
    {
        //type 1
        if (this.type == 1) {
            if ( this.quarterNum == 1 )
            {
                if ( this.num_gumballs > 0 )
                {
                    // after enject gumball, set value to default
                    this.num_gumballs-- ;
                    this.collectCoinSum = 0 ;
                    this.quarterNum = 0;
                    System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
                }
                else
                {
                    System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
                }
            }
            
        } else if (this.type == 2) {
            if (this.quarterNum == 2) {
                if ( this.num_gumballs > 0 )
                {
                    this.num_gumballs-- ;
                    this.quarterNum = 0;
                    this.collectCoinSum = 0 ;
                    System.out.println( "Thanks for your 2 quarters.  Gumball Ejected!" ) ;
                }
                else
                {
                    System.out.println( "No More Gumballs!  Sorry, can't return your 2 quarters." ) ;
                }

            } else {
                System.out.println( "Please insert a quarter" ) ;
            } 
        } else {
            int sum = getCoinSum();
            if (sum == this.cost) {
                if ( this.num_gumballs > 0 )
                {
                    this.num_gumballs-- ;
                    this.collectCoinSum = 0 ;
                    this.quarterNum = 0;
                    System.out.println( "Thanks for your coins.  Gumball Ejected!" ) ;
                }
                else
                {
                    System.out.println( "No More Gumballs!  Sorry, can't return your coin." ) ;
                }
            } else {
                System.out.println( "Please insert a coin" ) ;
            } 
        }
    }
}
