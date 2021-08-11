import java.lang.*;
import javax.swing.*;


class MySecondGui
{
	public static void main(String[] args)
	{
		JFrame frame=new JFrame("Puma GUI");


		//default methods

		frame.setSize(400,400);
		frame.setVisible(true);
		//jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}

