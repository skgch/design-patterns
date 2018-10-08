package bridge;

public class NormalDisplay implements DisplayImpl {

	public void rawOpen () {
		System.out.println("open");
	}

	public void rawPrint () {
		System.out.println("print");
	}

	public void rawClose () {
		System.out.println("close");
	}
}
