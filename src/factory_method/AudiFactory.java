package factory_method;

public class AudiFactory extends CarFactory {

	AudiFactory(String country) {
		super(country);
	}

	@Override
	public Car create(String name) {
		return new AudiCar(country, name);
	}
}
