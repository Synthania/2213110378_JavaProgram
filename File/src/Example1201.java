import java.util.*;
import java.io.*;

public class Example1201 {

	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(new File("MemberLogin.txt"));
		while (read.hasNext()) {
			String name = read.next();
			read.next();
			read.next();
			String email = read.next().toUpperCase();
			System.out.println(name + " (" + email + ")");
		}
		read.close();

	}

}
