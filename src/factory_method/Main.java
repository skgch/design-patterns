package factory_method;

public class Main {

	public static void main(String args[]) {
		CarFactory factory1 = new ToyotaFactory("Japan");
		Car car1 = factory1.create("Prius");
		Car car2 = factory1.create("Aqua");

		CarFactory factory2 = new AudiFactory("Germay");
		Car car3 = factory2.create("R8");

		CarFactory factory3 = new AudiFactory("USA");
		Car car4 = factory3.create("RS3");

		Car[] cars = { car1, car2, car3, car4 };
		for (Car car : cars) {
			car.showInfo();
		}
	}

}
