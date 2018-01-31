package me.ajonbin.designpattern.builder;

public class FullCourseDinner {
	public static class BuilderFullCourse{
		private String appetizer;
		private String salad;
		private String soap;
		private String mainCourse;
		private String dessert;
		private String fish;


		public BuilderFullCourse setAppetizer(String appetizer) {
			this.appetizer = appetizer;
			return this;
		}


		public BuilderFullCourse setSalad(String salad) {
			this.salad = salad;
			return this;
		}

		public BuilderFullCourse setSoap(String soap) {
			this.soap = soap;
			return this;
		}

		public BuilderFullCourse setMainCourse(String mainCourse) {
			this.mainCourse = mainCourse;
			return this;

		}

		public BuilderFullCourse setDessert(String dessert) {
			this.dessert = dessert;
			return this;
		}

		public BuilderFullCourse setFish(String fish) {
			this.fish = fish;
			return this;
		}

		public FullCourseDinner build(){
			return new FullCourseDinner(this);
		}
	}

	private final String appetizer;
	private final String salad;
	private final String soap;
	private final String mainCourse;
	private final String dessert;
	private final String fish;

	public FullCourseDinner(BuilderFullCourse builder) {
		this.appetizer = builder.appetizer;
		this.salad = builder.salad;
		this.soap = builder.soap;
		this.mainCourse =  builder.mainCourse;
		this.dessert = builder.dessert;
		this.fish = builder.fish;
	}

	public void getDinner(){
		StringBuilder builder = new StringBuilder();
		builder.append("Full Course Dinner Contains: \n");
		builder.append(appetizer == null ? "":" + " + appetizer);
		builder.append(salad == null ? "":" + " + salad);
		builder.append(soap == null ? "":" + " + soap);
		builder.append(fish == null ? "":" + " + fish);
		builder.append(mainCourse == null ? "":" + " + mainCourse);
		builder.append(dessert == null ? "":" + " + dessert);
		System.out.println(builder.toString());
	}
}
