package template_method;

public class CharDisplay extends Display {

	private char c;

	CharDisplay(char c) {
		this.c = c;
	}

	@Override
	public void open() {
		System.out.println("***");
	}

	@Override
	public void print() {
		System.out.println("*" + c + "*");
	}

	@Override
	public void close() {
		System.out.println("***");
	}
}
