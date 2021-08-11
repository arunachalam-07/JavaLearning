import java.lang.*;
import javax.swing.*;
import java.util.*;

class GuiWithComponent
{
	public static void main(String[] args)
	{
		JFrame frame=new JFrame("Using components");
		JButton button[]=new JButton[2];
		button[0]=new JButton("puma");
		button[1]=new JButton("click me");
		for(JButton temp:button)frame.add(temp);

		frame.setSize(300,300);
		frame.setVisible(true);
		// jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}
