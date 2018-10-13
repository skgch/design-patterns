package singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(10);
		try {
			for (int i = 0; i < 10; i++) {
				es.execute(() -> System.out.println(Singleton.getInstance()));
			}
		} finally {
			es.shutdown();
		}

		Singleton var1 = Singleton.getInstance();
		var1.setName("Bob");
		System.out.println(var1.getName());

		Singleton var2 = Singleton.getInstance();
		var2.setName("Taro");
		System.out.println(var1.getName());
		System.out.println(var2.getName());

	}

}
