package reflection;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {

		try {
			Class<?> c = Class.forName("reflection.Car");
			Object obj = c.newInstance();

			Method m = c.getMethod("setName", String.class);
			m.invoke(obj, "Toyota");
			m = c.getMethod("getName");
			System.out.println(m.invoke(obj));

			m = c.getMethod("setPrice", int.class);
			m.invoke(obj, 100);
			m = c.getMethod("getPrice");
			System.out.println(m.invoke(obj));

		} catch (ReflectiveOperationException e) {
			e.printStackTrace();
		}
	}
}
