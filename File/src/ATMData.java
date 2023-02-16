
public class ATMData {
	private String accontNumber, password;

	public ATMData(String acc, String pass) {
		this.accontNumber = acc;
		this.password = pass;
	}

	public String getID() {
		return accontNumber;
	}

	public String getPass() {
		return password;
	}
}
