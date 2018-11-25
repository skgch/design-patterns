package chain_of_responsibility;

public abstract class Support {

	private String name;
	private Support next;

	public Support(String name) {
		this.name = name;
	}

	public Support setNext(Support next) {
		this.next = next;
		return next;
	}

	public void support(Trouble trouble) {
		if (resolve(trouble)) {
			System.out.println(trouble + " is resolved by " + name);
		} else if (next != null) {
			next.support(trouble);
		} else {
			System.out.println(trouble + " is failed");
		}
	}

	abstract boolean resolve(Trouble trouble);
}
