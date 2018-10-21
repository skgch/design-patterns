package composite;

public class Main {

	public static void main (String args[]) {

		Directory root = new Directory("root");
		Directory work = new Directory("work");
		Directory work2 = new Directory("work2");
		File csv = new File("test.csv", 50.0);
		File text = new File("test.txt", 3.0);
		root.addChild(work);
		work.addChild(csv);
		work.addChild(work2);
		work.addChild(text);

		root.printLine("");
	}
}
