import java.lang.*;
import javax.swing.*;


class MyFirstGui
{
	public static void main(String[] args)
	{
		//Creation of Frame
		JFrame frame=new JFrame("MyFirstGUI");
		

		//compulsory methods 
		frame.setSize(300,300);
		//frame.setDefaultCloseOpeartion(JFrame.EXIT_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}
