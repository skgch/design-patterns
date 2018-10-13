package template_method;

public class Main {

	public static void main(String[] args) {

		Display cd = new CharDisplay('X');
		Display sd = new StringDisplay("Hello world!");

		cd.display();
		sd.display();
	}

}
