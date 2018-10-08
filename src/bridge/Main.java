package bridge;

public class Main {

	public static void main(String[] args) {

		Display display = new Display(new NormalDisplay());
		display.display();

		CountDisplay countDisplay = new CountDisplay(new AsterDisplay());
		countDisplay.multiDisplay(5);
	}

}
