package factory_method;

public abstract class Car {

	protected String country;
	protected String name;

	Car(String country, String name) {
		this.country = country;
		this.name = name;
	}

	protected abstract void showInfo();

}
