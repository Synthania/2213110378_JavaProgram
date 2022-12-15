import java.util.*;
public class Lab603 {
    static Scanner scan =new Scanner(System.in);
    static int[] numberofInteger = {78, 36, 58, 41, 25, 92,75};
    public static void main(String[] args) {
    	System.out.print("Input index of array : ");
    	int indexOfarray = scan.nextInt();
    	while(indexOfarray<0||indexOfarray>(numberofInteger.length-1)) {
    		System.out.print("Input index of array, agian : ");
    		indexOfarray = scan.nextInt();
    	}
    	System.out.println("\nValue in current index is "+(numberofInteger[indexOfarray]));
    //	System.out.println("\nValue in next index is "+(numberofInteger[indexOfarray+1]));
    	if(indexOfarray==6) {
    		System.out.println("Sorry, "+indexOfarray+" is the last indext in array.");
    	} else {
    		System.out.println("Value in next    index is "+(numberofInteger[indexOfarray+1]));
    	}
	}

}
