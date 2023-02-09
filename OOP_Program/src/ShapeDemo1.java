import java.util.*;

public class ShapeDemo1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Input radius: ");
		double r = s.nextDouble();
		System.out.print("Input height: ");
		double h = s.nextDouble();

		Circle cir = new Circle(r, null);
		System.out.println("Circle[" + cir + "]");
		System.out.println("Circle[area=" + cir.getArea() + "]\n");

		Cylinder cyl = new Cylinder(r, h);
		System.out.println("Cylinder[" + cyl + "]");
		System.out.println("Cylinder[area=" + cyl.getArea() + "]");
		System.out.println("Cylinder[volume=" + cyl.getVolume() + "]");
	}

}
