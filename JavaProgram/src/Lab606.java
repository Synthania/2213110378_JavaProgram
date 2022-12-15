import javax.swing.*;
public class Lab606 {

	public static void main(String[] args) {
		int[] nums = { 25, 78, 41, 22, 36, 85,37};
		int index = Integer.parseInt(JOptionPane.showInputDialog("Input  intdex of array: "));	
		while (!checkIndex(nums , index)) {
		     index = Integer.parseInt(JOptionPane.showInputDialog("Input  intdex of array, agian: "));
		}
		JOptionPane.showMessageDialog(null, "Current data, nums["+index+"] is "+currentData(nums ,index)+
				(index!=0 ? "\nPrevious data, nums["+(index-1)+"] is "+prevData(nums ,index) : "\nNo previous data")+
				(index!= nums.length -1? "\nNext data, nums["+(index+1)+"] is "+nextData(nums , index): "\nNo next data"));
		
    }
	public static boolean checkIndex(int[] nums , int index) {
			return (index >= 0 && index < 7) ? true : false ;
	}
	public static int currentData(int[] nums , int index) {
		/*int value = nums[index];
		return value;*/
		return nums[index];
	}
	static int prevData(int[] nums , int index) {
		return (index >=0 && index <=6) ? nums[index-1] : -1;
	}
	static int nextData(int[] nums , int index) {
		return (index >= 0 && index <=6) ? nums[index + 1] : -1;
	}
}
