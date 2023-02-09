
public class Rectangle extends shape {
	private double width;
	private double length;

	public Rectangle(double width, double length, String color) {
		super(color);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return this.width;
	}

	public double getLength() {
		return this.length;
	}

	public double getArea() {
		return getWidth() * getLength();
	}

	public String toString() {
		return "Rectangle[width= " + getWidth() + " ,length= " + getLength() 
		+ " ," + super.toString() + "]";
	}
}
