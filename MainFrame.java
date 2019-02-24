import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	
	private JButton add;
	
	public MainFrame() {
		
		super("RemindAlerter Application");
		
		setLayout(new BorderLayout());
	
	    add = new JButton("Create Account");
		
		add(add,BorderLayout.NORTH);
		
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		
	}
	
}
