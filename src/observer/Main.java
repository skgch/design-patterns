package observer;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		NumberHolder holder = new NumberHolder();
		for (int i = 0; i < 10; i++) {
			holder.addObserver(new NumberObserverA(holder));
			holder.addObserver(new NumberObserverB(holder));
		}

		Random random = new Random();
		int randomValue = random.nextInt(100);
		holder.setNumber(randomValue);

		CharHolder cholder = new CharHolder();
		cholder.addObserver(new CharObserver(cholder));
		cholder.addObserver(new CharObserver(cholder));

		int randomIndex = random.nextInt(5);
		char[] chars = {'a', 'b', 'c', 'd', 'f'};
		cholder.setChar(chars[randomIndex]);
 	}

}
