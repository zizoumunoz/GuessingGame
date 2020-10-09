import javax.swing.JFrame;
import javax.swing.JLabel;

public class GuessingGame extends JFrame {
	public GuessingGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Zinedine's Guessing Game");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Zinedine's Guessing Game");
		lblNewLabel.setBounds(217, 11, 47, 14);
		getContentPane().add(lblNewLabel);
	}

	public static void main(String[] args) {

	}
}
