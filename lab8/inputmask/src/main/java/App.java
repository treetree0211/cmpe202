/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private CreditCardNum num;
    private CreditCardExp exp;
    private CreditCardCVC cvc;
    private SpaceDecorator sd;
    private int count;

    public App() {

        screen = new Screen();
        num = new CreditCardNum();
        exp = new CreditCardExp();
        cvc = new CreditCardCVC();
        sd = new SpaceDecorator();

        num.wrapDecorator(sd);
        exp.wrapDecorator(sd);
        screen.addSubComponent(num);
        screen.addSubComponent(exp);
        screen.addSubComponent(cvc);

        count = 0;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        //output += "count" + count;
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {
        // make sure input to be just numbers     
        if(ch.matches("[0-9]+")) {
            count++;
            screen.key(ch, count);
        }  

        //implement delete function
        if ((ch.equals("X") || ch.equals("Delete")) && count > 0) {  
             
            screen.key(ch, count);
            count--; 
            
        }
        
        
    }

}

