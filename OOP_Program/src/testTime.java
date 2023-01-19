
public class testTime {
	public static void main(String[] args) {
		// test constructor and toString
		Time t1 = new Time(1, 2, 3);
		System.out.println(t1); // call toString() Method
		Time t2 = new Time();
		System.out.println(t2);// call toString() Method 

		// Test Setter and Getter
		t1.setHour(4);
		t1.setMinute(5);
		t1.setSecond(6);
		System.out.println("\n" + t1);
		System.out.println("Hour is: " + t1.getHour());
		System.out.println("Minute is: " + t1.getMinute());
		System.out.println("Second is: " + t1.getSecond());

		// Test settime()
		t1.setTime(58, 59, 23);
		System.out.println("\n" + t1);

		System.out.println(t1.nextSecond());
	}

}
