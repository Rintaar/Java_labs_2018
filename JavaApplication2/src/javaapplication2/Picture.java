package javaapplication2;

public class Picture implements Present {

	@Override
	public String whoAmI() {
		return "Картина";
	}

	@Override
	public String itCanBePresented() {
		return "Это подарок";
	}
}
