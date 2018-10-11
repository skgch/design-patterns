package observer;

import java.util.ArrayList;
import java.util.List;

public class Model {

	private List<Observer> obsList = new ArrayList<>();

	public void addObserver (Observer obs) {
		this.obsList.add(obs);
	}

	public void notifyChange () {
		for (Observer obs : obsList) {
			obs.update();
		}
	}
}
