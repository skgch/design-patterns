package template_method;

public class StringDisplay extends Display {

	private String s;

	StringDisplay(String s) {
		this.s = s;
	}

	@Override
	public void open() {
		printLine();
	}

	@Override
	public void print() {
		System.out.println("|" + s + "|");
	}

	@Override
	public void close() {
		printLine();
	}

	private void printLine() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length() + 2; i++) {
//			System.out.print("-");
			sb.append("-");
		}
		System.out.println(sb);
	}

}
