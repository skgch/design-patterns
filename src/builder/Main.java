package builder;

public class Main {

	public static void main(String[] args) {

		Food food = new Food.Builder(5.0).vitaminA(54.3).vitaminC(345.55).build();

		System.out.println(food);
	}

}
