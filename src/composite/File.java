package composite;

public class File implements Entry {

	private String name;
	private double size;

	public File (String name, double size) {
		this.name = name;
		this.size = size;
	}

	@Override
	public void printLine (String parentDir) {
		System.out.println(parentDir + "/" + name + " size:" + size);
	}

	@Override
	public double getSize () {
		return size;
	}

}
