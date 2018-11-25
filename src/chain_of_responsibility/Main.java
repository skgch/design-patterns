package chain_of_responsibility;

public class Main {

	public static void main(String[] args) {

		Support odd = new OddSupport("odd");
		Support special = new SpecialSupport("special");
		Support limit = new LimitSupport("limit");

		odd.setNext(special).setNext(limit);

		odd.support(new Trouble(20));
		odd.support(new Trouble(333));
		odd.support(new Trouble(777));
		odd.support(new Trouble(777 * 2));
		odd.support(new Trouble(1000));
		odd.support(new Trouble(1001));
	}

}
