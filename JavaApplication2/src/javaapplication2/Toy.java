package javaapplication2;

public class Toy implements Present {

	@Override
	public String whoAmI() {
		return "Игрушка";
	}

	@Override
	public String itCanBePresented() {
		return "Это подарок";
	}
}
