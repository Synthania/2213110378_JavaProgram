import java.util.*;
public class RectangleDemo2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Input width: ");
		double w = s.nextDouble();
		System.out.print("Input length: ");
		double l = s.nextDouble();
		
		Rectangle2 rec = new Rectangle2(w, l);
		System.out.println(rec+ "\nArea of Rectangle is " + rec.getArea());
		
	}

}
