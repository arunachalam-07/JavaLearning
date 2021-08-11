import java.lang.*;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.*;


class ButtonColors
{
	public static void main(String[] args)
	{
		JFrame frame=new JFrame("test button");
		GridLayout gl =new GridLayout(3,3);
		JButton[] button=new JButton[4];
		for(int i=0;i<4;i++)
		{
			button[i]=new JButton(String.valueOf(i));
			button[i].setForeground(new Color(150+i,200+i,100+i));
			button[i].setBackground(new Color(200+i,100+i,150+i));
			frame.add(button[i]);
		}
	
		frame.setLayout(gl);
		frame.setSize(300,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}
