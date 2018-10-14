package factory_method;

public abstract class CarFactory {

	protected String country;

	CarFactory(String country) {
		this.country = country;
	}

	protected abstract Car create(String name);
}
