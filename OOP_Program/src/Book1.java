
public class Book1 {
	private String title;
	private Author1 author;
	private int page;

	public Book1(String title, Author1 author, int page) {
		this.title = title;
		this.author = author;
		this.page = page;
	}

	public Book1(String title, Author1 author) {
		this.title = title;
		this.author = author;
		this.page = 0;
		// this(title,author,0);
	}

	public Book1() {
		this(null, null, 0);
		// title = "";
		// author = null;
		// page = 0;
	}

	public String getTitle() {
		return this.title;
	}

	public Author1 getAuthor() {
		return author;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPage() {
		return this.page;
	}

	public String toString() {
		return getTitle() + " has " + getPage() + " pages write by " + author;
	}
}
