package adapter;

public class Main {

	public static void main(String[] args) {
		// Original
		Printer printer = new PrinterImpl("Printer");
		printer.printStrong();
		printer.printWeek();

		// Adapter with delegate
		printer = new Adapter1(new Banner("Banner"));
		printer.printStrong();
		printer.printWeek();

		// Adapter with extend
		printer = new Adapter2("Banner");
		printer.printStrong();
		printer.printWeek();
	}

}
