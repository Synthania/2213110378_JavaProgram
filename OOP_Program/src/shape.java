
public abstract class shape {
	private String color;

	public shape(String color) {
		this.color = color;
	}

	public shape() {
		color = null;
	}

	public abstract double getArea();

	public String toString() {
		return "color = " + this.color;
	}
}
