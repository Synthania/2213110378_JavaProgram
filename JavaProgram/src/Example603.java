import java.util.*;
public class Example603 {

	public static void main(String[] args) {
		int[] nums = new int[5];
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<nums.length;i++) {
			System.out.print("Input number "+(i+1)+" : ");
			nums[i] = scan.nextInt(); 
		}
		int totalNumber = sumOfpos(nums);
		System.out.println("\nSummation of positive number is "+totalNumber );
	}
    public static int sumOfpos(int[] number) {
    	int sum= 0;
    	for(int numBer : number) {
    		sum+=numBer;
    	}
    	return sum;
    }
}
