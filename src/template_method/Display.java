package template_method;

public abstract class Display {

	abstract public void open();
	abstract public void print();
	abstract public void close();

	public void display() {
		open();
		for (int i = 0; i < 3; i++) {
			print();
		}
		close();
	}
}
