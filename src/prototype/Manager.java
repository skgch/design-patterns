package prototype;

import java.util.HashMap;
import java.util.Map;

public class Manager {

	private Map<String, Product> showcase = new HashMap<>();

	public void add(String key, Product product) {
		showcase.put(key, product);
	}

	public Product getClone(String key) {
		Product p = showcase.get(key);
		if (p == null) return null;
		return p.createClone();
	}
}
