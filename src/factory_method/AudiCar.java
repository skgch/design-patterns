package factory_method;

public class AudiCar extends Car {


	AudiCar(String country, String name) {
		super(country, name);
	}

	@Override
	public void showInfo() {
		System.out.println(name + ": Maker is Audi. Made in " + country + ".");
	}

}
