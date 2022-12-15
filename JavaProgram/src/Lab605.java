import javax.swing.JOptionPane;
public class Lab605 {

	public static void main(String[] args) {
		int nums[] = new int[5];
		for(int i=0; i<nums.length;i++) {
			nums[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number "+(i+1)+" : "));
		}
		showEven(nums);
		showOdd(nums);

	}
	public static void showEven(int[] number) {
		String listOfEven = " ";
		for(int _number : number ) {
			if(_number%2==0) {
				listOfEven = listOfEven+_number+ " ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even number: \n"+listOfEven);
	}
	public static void showOdd(int[] number) {
		String listOfOdd = " ";
		for(int _number : number ) {
			if(_number%2!=0) {
				listOfOdd = listOfOdd+_number+ " ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of odd number: \n"+listOfOdd);
	}

}
