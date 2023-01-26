import javax.swing.*;

public class BookDemo2 {

	public static void main(String[] args) {
		String ipname = JOptionPane.showInputDialog("Input author name:");
		String ipmail = JOptionPane.showInputDialog("Input author e-mail:");
		String iptitle = JOptionPane.showInputDialog("Input book title:");
		int page = Integer.parseInt(JOptionPane.showInputDialog("Input book page:"));
		int result = JOptionPane.showConfirmDialog(null, "Is the page correct?", "Confirm", JOptionPane.YES_NO_OPTION);

		Book1 book = new Book1(iptitle, new Author1(ipname, ipmail), page);
		if (result == 1 ) {
			page = Integer.parseInt(JOptionPane.showInputDialog("Input book page, again:"));
			book.setPage(page);
		} 
		JOptionPane.showMessageDialog(null,
				"Book Title: " + book.getTitle() + "\nAuthor name: " + book.getAuthor().getName() + " ("
						+ +book.getPage() + " page)\nAuthor e-mail: " + book.getAuthor().getEmail());
	}

}
