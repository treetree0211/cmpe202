/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private ISpacerDecorator spaceDecorator;
	private String number = "" ;

	public void wrapDecorator(ISpacerDecorator sd) {
		this.spaceDecorator = sd;
	}

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( number.equals("") )
			return "[4444 4444 4444 4444]" + "  " ;
		else
			return "[" + spaceDecorator.display(number) + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if ( cnt <= 16 ) {
			if (ch.equals("X") || ch.equals("Delete")) {
					number = number.substring(0, number.length() - 1);
				} else {
					number += ch ;
			}
		}
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}