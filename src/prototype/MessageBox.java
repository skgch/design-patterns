package prototype;

public class MessageBox implements Product, Cloneable {

	private char c;

	public MessageBox(char c) {
		this.c = c;
	}

	@Override
	public void use(String message) {
		int length = message.length();
		for (int i = 0; i < length + 2; i++) {
			System.out.print(c);
		}
		System.out.println();
		System.out.println(c + message + c);
		for (int i = 0; i < length + 2; i++) {
			System.out.print(c);
		}
		System.out.println();
	}

	@Override
	public Product createClone() {
		Product cloned = null;
		try {
			cloned = (Product) this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}

}
