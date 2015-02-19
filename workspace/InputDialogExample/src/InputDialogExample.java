import javax.swing.JOptionPane;


public class InputDialogExample {

	public static void main(String[] args) {
		String response = JOptionPane.showInputDialog(null, "Please enter your name", "Name Input", JOptionPane.INFORMATION_MESSAGE);
		if (response != null && !response.isEmpty()){
			JOptionPane.showMessageDialog(null, "Thank you " + response + "!");
		}
		else {
			JOptionPane.showMessageDialog(null, "You didn't enter a respone. Please try again later.");
		}
	}
}
