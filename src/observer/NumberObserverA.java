package observer;

public class NumberObserverA implements Observer {

	private NumberHolder holder;

	public NumberObserverA (NumberHolder holder) {
		this.holder = holder;
	}

	public void update () {
		System.out.println("Number was changed : " + holder.getNumber());
	}
}
