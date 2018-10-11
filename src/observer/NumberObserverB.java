package observer;

public class NumberObserverB implements Observer {

	private NumberHolder holder;

	public NumberObserverB (NumberHolder holder) {
		this.holder = holder;
	}

	public void update () {
		System.out.println("Update number : " + holder.getNumber());
	}
}
