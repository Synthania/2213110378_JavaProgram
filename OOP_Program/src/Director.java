
public class Director {
	private String name;
	private String email;
	private char gender;

	public Director(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public Director(String name, String email) {
		this.name = name;
		this.email = email;
		this.gender = ' ';
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
		return getName() + "(" + getEmail() + ";" + getGenderName() + ")";
	}

}
