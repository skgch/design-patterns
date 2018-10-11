package observer;

public class CharHolder extends Model {

	private char c;

	public void setChar (char c) {
		this.c = c;
		notifyChange();
	}

	public char getChar () {
		return c;
	}
}
