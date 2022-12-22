import java.util.*;

public class StudentScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many student in classroom : ");
		int Student = scan.nextInt();
		Student[] std = new Student[Student];
		System.out.println();
		for (int i = 0; i < std.length; i++) {
			std[i] = new Student();
			System.out.print("Input student name  : ");
			std[i].setName(scan.next());
			System.out.print("Input student score : ");
			std[i].setScore(scan.nextInt());
			while (!std[i].checkScore()) {
				System.out.print("Input student score, agian: ");
				std[i].setScore(scan.nextInt());
				
			}
			System.out.println("-----------------------------------");
		}
		System.out.println();
		/*
		 * for (int i = 0; i < std.length; i++) { if (std[i].isPass()) {
		 * System.out.println(">> " + std[i].getName() + " ( " + std[i].getScore() +
		 * " )"); } }
		 */
		for (Student _std : std) {
			if (_std.isPass()) {
				System.out.println(">> " + _std.getName() + " get grade " + _std.findGrade(_std.getScore()));
			}
		}
	}

}
