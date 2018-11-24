package prototype;

public class Main {

	public static void main(String[] args) {
		UnderPen pen = new UnderPen('*');
		MessageBox box1 = new MessageBox('*');
		MessageBox box2 = new MessageBox('.');

		Manager manager = new Manager();
		manager.add("aster pen", pen);
		manager.add("aster box", box1);
		manager.add("dot box", box2);

		Product p = manager.getClone("aster pen");
		p.use("Hello world!");
		p = manager.getClone("aster box");
		p.use("Hello world!");
		p = manager.getClone("dot box");
		p.use("Hello world!");

	}

}
