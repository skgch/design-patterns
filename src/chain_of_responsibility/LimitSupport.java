package chain_of_responsibility;

public class LimitSupport extends Support {

	public LimitSupport(String name) {
		super(name);
	}

	@Override
	boolean resolve(Trouble trouble) {
		return trouble.getNumber() < 1000;
	}
}
