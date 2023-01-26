
public class TestStudent {

	public static void main(String[] args) {
		Student stu = new Student("Jirapat Anantasiri", "1 Happy ave");
		System.out.println(stu); // toString

		stu.setName("25 Pattanakran");
		System.out.println(stu);
		System.out.println(stu.getName());
		System.out.println(stu.getAddress());

		stu.addCourseGrade("INT107", 25);
		stu.addCourseGrade("INT108", 79);
		stu.addCourseGrade("MSC202", 69);
		stu.printGrade();

		System.out.printf("The average grade is %.2f%n", stu.getAverageGrade());

	}

}
