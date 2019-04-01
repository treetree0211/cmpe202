public class SpaceDecorator implements ISpacerDecorator{

	public SpaceDecorator() {

	}

	public String display(String cardNumber) {
		String result = "";

		for(int i = 0; i < cardNumber.length(); i++) {
			result += String.valueOf(cardNumber.charAt(i));
			if (i < 12 && i % 4 == 3) result += " ";
		}

		return result;
	}

	public String date(String time) {
		String result = "";

		for(int i = 0; i < time.length(); i++) {
			result += String.valueOf(time.charAt(i));
			if (i == 1) result += "/";
		}

		return result;
	}
}