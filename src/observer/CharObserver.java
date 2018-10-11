package observer;

public class CharObserver implements Observer {

	private CharHolder holder;

	public CharObserver (CharHolder holder) {
		this.holder = holder;
	}

	public void update () {
		System.out.println("Update char : " + holder.getChar());
	}
}
