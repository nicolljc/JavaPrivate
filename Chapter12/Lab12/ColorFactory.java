import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorFactory extends JFrame
{
	private JLabel messageLable;
	private JButton redButton;
	private JButton orangeButton;
	private JButton yellowButton;
	private JRadioButton greenButton;
	private JRadioButton blueButton;
	private JRadioButton cyanButton;
	private ButtonGroup radioButtonGroup;
	private JPanel panel;
	private JPanel panel1;
	private JPanel panel2;
	private final int WINDOW_WIDTH = 500;
	private final int WINDOW_HEIGHT = 300;
	
	public ColorFactory()
	{
		setTitle("Color Factory");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout(0, 10));
		
		messageLable = new JLabel("Top buttons change the panel" +
			" color and bottom radio buttons change the text color.");
			
		redButton = new JButton("Red");
		orangeButton = new JButton("Orange");
		yellowButton = new JButton("Yellow");
		
		greenButton = new JRadioButton("Green");
		blueButton = new JRadioButton("Blue");
		cyanButton = new JRadioButton("Cyan");
		
		radioButtonGroup = new ButtonGroup();
		radioButtonGroup.add(greenButton);
		radioButtonGroup.add(blueButton);
		radioButtonGroup.add(cyanButton);
		
		redButton.addActionListener(new ButtonListener());
		orangeButton.addActionListener(new ButtonListener());
		yellowButton.addActionListener(new ButtonListener());
		greenButton.addActionListener(new RadioButtonListener());
		blueButton.addActionListener(new RadioButtonListener());
		cyanButton.addActionListener(new RadioButtonListener());
		
		panel = new JPanel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel2.add(messageLable);
		panel.add(redButton);
		panel.add(orangeButton);
		panel.add(yellowButton);
		panel1.add(greenButton);
		panel1.add(blueButton);
		panel1.add(cyanButton);
		
		redButton.setBackground(Color.RED);
		orangeButton.setBackground(Color.ORANGE);
		yellowButton.setBackground(Color.YELLOW);
		greenButton.setBackground(Color.GREEN);
		blueButton.setBackground(Color.BLUE);
		cyanButton.setBackground(Color.CYAN);
		panel.setBackground(Color.WHITE);
		panel1.setBackground(Color.WHITE);
		
		add(panel, BorderLayout.NORTH);
		add(panel1, BorderLayout.SOUTH);
		add(panel2, BorderLayout.CENTER);
		setVisible(true);
	}
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String actionCommand = e.getActionCommand();
			
			if (actionCommand.equals("Red"))
			{
				panel2.setBackground(Color.RED);
			}
			else if (actionCommand.equals("Orange"))
			{
				panel2.setBackground(Color.ORANGE);
			}
			else if (actionCommand.equals("Yellow"))
			{
				panel2.setBackground(Color.YELLOW);
			}
		}
	}
	
	private class RadioButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String actionCommand = e.getActionCommand();
			
			if (actionCommand.equals("Green"))
			{
				messageLable.setForeground(Color.GREEN);
			}
			else if (actionCommand.equals("Blue"))
			{
				messageLable.setForeground(Color.BLUE);
			}
			else if (actionCommand.equals("Cyan"))
			{
				messageLable.setForeground(Color.CYAN);
			}
		}
	}
	
	public static void main(String[] args)
	{
		ColorFactory cw = new ColorFactory();
	}
}
	