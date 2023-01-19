
public class Author {
	private String name;
	private String email;
	private char gender;

	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public Author(String name, String email) {
		this.name = name;
		this.email = email;
		gender = '\u0000';
	}

	public Author() {
		name = "";
		email = "";
		gender = '\u0000';
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getGenderName() {
		return (gender + "").equalsIgnoreCase("M") ? "Male" : (gender + "").equalsIgnoreCase("F") ? "Female" : "";
	}

	public String toString() {
		return "Author name: " + getName() + " (" + getEmail() + ";" + getGenderName() + ")";
	}
}
