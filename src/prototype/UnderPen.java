package prototype;

public class UnderPen implements Product, Cloneable {

	private char c;

	public UnderPen(char c) {
		this.c = c;
	}

	@Override
	public void use(String message) {
		System.out.println(message);
		for (int i = 0; i < message.length(); i++) {
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
