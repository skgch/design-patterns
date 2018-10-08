package bridge;

public class AsterDisplay implements DisplayImpl {

	public void rawOpen () {
		System.out.println("*open*");
	}

	public void rawPrint () {
		System.out.println("*print*");
	}

	public void rawClose () {
		System.out.println("*close*");
	}

}
