
public class PersonalInfo {
	private Person name;
	private Date dDay;
	private int personID;

	public PersonalInfo() {
		name = new Person();
		dDay = new Date();
		personID = 0;
	}

	public PersonalInfo(String first, String last, int month, int day, int year, int ID) {
		name = new Person(first, last);
		dDay = new Date(month, day, year);
		personID = ID;
	}

	public void setPersonInfo(String first, String last, int month, int day, int year, int ID) {
		name.setName(first, last);
		dDay.setDate(month, day, year);
		personID = ID;
	}

	public String toString() {
		return "Name : " + name.toString() + "\nDate of birth: " + dDay.toString() + "\nPerson ID: " + personID;
	}
}
