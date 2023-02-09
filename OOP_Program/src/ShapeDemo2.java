import java.util.*;

public class ShapeDemo2 {

	public static void main(String[] args) {
		Cylinder cyl[] = new Cylinder[5];
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < cyl.length; i++) {
			System.out.print("Input radius: ");
			double r = s.nextDouble();
			System.out.print("Input height: ");
			double h = s.nextDouble();
			cyl[i] = new Cylinder(r, h);
		}

		System.out.println();
		for (int i = 0; i < cyl.length; i++) {
			System.out.println("Cylinder " + (i + 1) + ", volume=" + cyl[i].getVolume());
		}
	}

}
