package factory_method;

public class ToyotaFactory extends CarFactory {

	ToyotaFactory(String country) {
		super(country);
	}

	@Override
	public Car create(String name) {
		return new ToyotaCar(country, name);
	}
}
