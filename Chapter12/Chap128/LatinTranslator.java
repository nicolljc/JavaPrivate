import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LatinTranslator extends JFrame
{
	private JButton sinisterButton;		// Button for Sinister
	private JButton dexterButton;		// Button for Dexter
	private JButton mediumButton;		// Button for Medium
	private JPanel panel;				// JPanel object
	private final int WINDOW_WIDTH = 420;	// Width
	private final int WINDOW_HEIGHT = 170;	// Height
	
	// Constructor
	public LatinTranslator()
	{
		// Set title, size, close operation, and layout
		setTitle("Simple Latin Translator");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout(0, 10));
		
		// Assign button names
		sinisterButton = new JButton("Sinister");
		dexterButton = new JButton("Dexter");
		mediumButton = new JButton("Medium");
		
		// Add ActionListeners to ButtonListeners
		sinisterButton.addActionListener(new ButtonListener());
		dexterButton.addActionListener(new ButtonListener());
		mediumButton.addActionListener(new ButtonListener());
		
		// Initialize JPanel and add buttons
		panel = new JPanel();
		panel.add(sinisterButton);
		panel.add(dexterButton);
		panel.add(mediumButton);
		add(panel);
		setVisible(true);
	}
	
	// Button Listener Thread
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource() == sinisterButton)
				JOptionPane.showMessageDialog(null, "Left");
			else if (e.getSource() == dexterButton)
				JOptionPane.showMessageDialog(null, "Right");
			else if (e.getSource() == mediumButton)
				JOptionPane.showMessageDialog(null, "Center");
		}
	}
	
	public static void main(String[] args)
	{
		LatinTranslator latinTranslate = new LatinTranslator();
	}
}