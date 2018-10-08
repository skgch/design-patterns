package adapter;

public class Adapter1 implements Printer {

	private Banner banner;

	public Adapter1 (Banner banner) {
		this.banner = banner;
	}

	@Override
	public void printStrong () {
		banner.showWithParen();
	};

	@Override
	public void printWeek () {
		banner.showWithAster();
	};

}
