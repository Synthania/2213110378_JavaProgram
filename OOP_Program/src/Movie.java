
public class Movie {
	private String id;
	private String name;
	private Director director;

	public Movie(String id, String name, Director director) {
		this.id = id;
		this.name = name;
		this.director = director;
	}

	public Movie() {
		this(null, null, null);
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public Director getDirector() {
		return director;
	}

	public String toString() {
		return getId() + " " + getName() + " direct by " + director;
	}
}
