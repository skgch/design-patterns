package composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Entry {

	private String name;
	private double size = 0.0;
	private List<Entry> children = new ArrayList<>();

	public Directory (String name) {
		this.name = name;
	}

	public Entry addChild (Entry e) {
		children.add(e);
		return this;
	}

	@Override
	public void printLine (String parentDir) {
		children.forEach(e -> {
			e.printLine(parentDir + "/" + name);
			size += e.getSize();
		});
		System.out.println(parentDir + "/" + name + " size:" + size);
	}

	@Override
	public double getSize () {
		return size;
	}
}
