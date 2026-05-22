package in.langfun.constructors;

//PEDDI 
public class Movie {

	String name;
	String hero;
	String heroine;
	String director;
	double budget;
	String producer;

	private Movie() {
		this("unknwn", "unknown");
		System.out.println("PEDDI Movie information !");
	}

	public Movie(String director, String producer) {
		this.director = director;
		this.producer = producer;
	}

	public Movie(Movie m, String hero, String name, String heroine) {
		this(name, hero, heroine, m.director, m.budget, m.producer);
	}

	public Movie(String name, String hero, String heroine, String director, double budget, String producer) {
		this(director, producer);
		this.name = name;
		this.hero = hero;
		this.heroine = heroine;
		this.budget = budget;
	}

	Movie(Movie a, double budget) {
		this(a.name, a.hero, a.heroine, a.director, budget, a.producer);
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Movie m = new Movie();
		m.show();

		Movie m1 = new Movie("Buchi babu", "Mytri Movies");
		m1.show();

		Movie m2 = new Movie(m1, "Ram Charan Teja", "PEDDI", "Jahnavi Kapoor");
		m2.show();

		Movie m3 = new Movie(m2, 3500000000000.00);
		m3.show();

		System.out.println("main method ended ");

	}

	void show() {
		System.out.println("*************show methdod called***********************");
		System.out.println("Name of the movie : " + name);
		System.out.println("Hero of the movie : " + hero);
		System.out.println("Heroine of the movie : " + heroine);
		System.out.println("Produce of the movie : " + producer);
		System.out.println("Dircetor of the movie : " + director);
		System.out.println("Budget : " + budget);
		System.out.println("************************************");

	}

}
