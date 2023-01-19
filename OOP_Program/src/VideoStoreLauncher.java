
public class VideoStoreLauncher {

	public static void main(String[] args) {
		// Test a Video.
		video vid1 = new video();
		vid1.setTitle("The Godfather");

		vid1.addRating(3);
		vid1.addRating(2);
		vid1.addRating(5);

		System.out.println(vid1.getTitle() + ":" + vid1.getRating());

		vid1.checkOut();
		getStatus(vid1);
		vid1.returnToStore();
		getStatus(vid1);
	}// end of Main

	public static void getStatus(video v) {
		if (v.isCheckedOut()) {
			System.out.println("\'" + v.getTitle() + "\' is check out.");
		} else {
			System.out.println("\'" + v.getTitle() + "\' is on the shelves.");
		}
	}// end of getStatus()

}
