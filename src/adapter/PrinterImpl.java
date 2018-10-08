package adapter;

public class PrinterImpl implements Printer {

	private String message;

	public PrinterImpl (String message) {
		this.message = message;
	}

	@Override
	public void printStrong () {
		System.out.println("!" + message + "!");
	}

	@Override
	public void printWeek () {
		System.out.println("~" + message + "~");
	}

}
