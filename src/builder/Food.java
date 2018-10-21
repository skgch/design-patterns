package builder;

public class Food {

	private double size;

	private double vitaminA;
	private double vitaminB;
	private double vitaminC;

	static class Builder {
		private double size;

		private double vitaminA;
		private double vitaminB;
		private double vitaminC;

		public Builder (double size) {
			this.size = size;
		}

		public Builder vitaminA (double vitaminA) {
			this.vitaminA = vitaminA;
			return this;
		}

		public Builder vitaminB (double vitaminB) {
			this.vitaminB = vitaminB;
			return this;
		}

		public Builder vitaminC (double vitaminC) {
			this.vitaminC = vitaminC;
			return this;
		}

		public Food build () {
			return new Food(this);
		}
	}

	private Food(Builder builder) {
		size = builder.size;
		vitaminA = builder.vitaminA;
		vitaminB = builder.vitaminB;
		vitaminC = builder.vitaminC;
	}

	@Override
	public String toString() {
		return "Food [size=" + size + ", vitaminA=" + vitaminA + ", vitaminB=" + vitaminB + ", vitaminC=" + vitaminC
				+ "]";
	}

}
