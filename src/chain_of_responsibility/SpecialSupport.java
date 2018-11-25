package chain_of_responsibility;

public class SpecialSupport extends Support {

	public SpecialSupport(String name) {
		super(name);
	}

	@Override
	boolean resolve(Trouble trouble) {
		return trouble.getNumber() % 777 == 0;
	}

}
