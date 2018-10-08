package bridge;

public class CountDisplay extends Display {

	public CountDisplay(DisplayImpl impl) {
		super(impl);
	}

	public void multiDisplay (int n) {
		System.out.println("--- multiDisplay ---");
		open();
		for (int i = 0; i < n; i++) {
			print();
		}
		close();
	}

}
