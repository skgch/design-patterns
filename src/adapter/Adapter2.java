package adapter;

public class Adapter2 extends Banner implements Printer  {

	public Adapter2 (String message) {
		super(message);
	}

	@Override
	public void printStrong () {
		showWithParen();
	}

	@Override
	public void printWeek () {
		showWithAster();
	}
}
