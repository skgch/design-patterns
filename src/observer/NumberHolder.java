package observer;

public class NumberHolder extends Model{

	private int number;

	public void setNumber (int number) {
		this.number = number;
		notifyChange();
	}

	public int getNumber () {
		return number;
	}


}
