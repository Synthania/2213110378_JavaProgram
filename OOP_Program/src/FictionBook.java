import java.time.Year;

public class FictionBook implements Authorr , Bookk{
	
	private String author_name , email , title;
	private int publicYear;
	
	public FictionBook(String title,int publicYear) {
		this.title = title;
		this.publicYear = publicYear;
	}
	
	public void setAuthorName(String name) {
		author_name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean checkFormatName() {
		return ;
	}
	
	public String getLastName() {
		return author_name.split(" ")[0].toLowerCase();
	}
	
	public String getFirstName() {
		return author_name.split(" ")[1].toLowerCase();
	}
	
	public boolean checkEmail() {
		if(email.endsWith("@gmail.com")||email.endsWith("windowslive.com")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int totalPublicYear() {
		return (Year.now().getValue()- publicYear);
	}
	
	public String toString() {
		return title+" write by "+ getLastName().charAt(0) +"."+getFirstName()+" ("+this.email +")\nPublished for "
				+totalPublicYear()+" years.";
				
	}
}
