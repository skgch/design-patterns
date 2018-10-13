package singleton;

public final class Singleton {

	private static final class SingletonHolder {
		private static final Singleton INSTANCE = new Singleton();
	}


	private Singleton () {
		System.out.println("Instance created.");
	}

	public static Singleton getInstance () {
		return SingletonHolder.INSTANCE;
	}

	private String name;

	public void setName (String name) {
		this.name = name;
	}

	public String getName () {
		return name;
	}
}
