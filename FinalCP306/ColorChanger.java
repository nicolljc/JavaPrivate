import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChanger extends JFrame
{
	private JButton changeColor;
	private JPanel panel;
	private final int WINDOW_WIDTH = 500;
	private final int WINDOW_HEIGHT = 100;
	
	public ColorChanger()
	{
		setTitle("Changing Color");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout(0, 10));
			
		changeColor = new JButton("Change Color");
		
		changeColor.addActionListener(new ButtonListener());
		
		panel = new JPanel();
		panel.add(changeColor);
		
		changeColor.setBackground(Color.GRAY);
		
		add(panel, BorderLayout.NORTH);
		setVisible(true);
	}
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String actionCommand = e.getActionCommand();
			
			if (actionCommand.equals("Change Color"))
			{
				panel.setBackground(Color.RED);
			}
		}
	}
	
	public static void main(String[] args)
	{
		ColorChanger cw = new ColorChanger();
	}
}
	