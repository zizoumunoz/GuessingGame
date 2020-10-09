import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class GuessingGame extends JFrame {
	private JTextField textField;
	public GuessingGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Zinedine's Guessing Game");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Zinedine's HiLo Guessing Game");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel.setBounds(159, 11, 204, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter a number between 1 and 100:");
		lblNewLabel_1.setBounds(61, 62, 178, 14);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(249, 59, 96, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
	}

	public static void main(String[] args) {

	}
}
