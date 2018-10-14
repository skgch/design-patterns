package factory_method;

public class ToyotaCar extends Car {

	ToyotaCar(String country, String name) {
		super(country, name);
	}

	@Override
	public void showInfo() {
		System.out.println(name + ": Maker is Toyota. Made in " + country + ".");
	}

}
