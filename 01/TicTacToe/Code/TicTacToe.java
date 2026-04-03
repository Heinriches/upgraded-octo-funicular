import java.awt.*;
import java.awt.event.*;

public class TicTacToe
{
	public static void main(String[] args)
	{
		System.out.println("Game is starting...");
		
		new Demo();
		
	}
	
	class Demo extends Frame implements ActionListener		// This class is the Window Blueprint
	{
		Demo()												// Class constructor-method
		{
			System.out.println("Building the window...");
			setLayout(null);								// Manual placement of buttons
			setSize(800, 600);								// Width and Height
			setLocation(400, 100);							// Where it appears on your monitor
			setBackground(Color.BLACK);						// Window background color
			setVisible(true);								// Make it appear
		}
		
		public void actionPerformed(ActionEvent e)			// This method is the "Ear", that listens for clicks 
		{
			// Logic goes here later
		}
	}
}