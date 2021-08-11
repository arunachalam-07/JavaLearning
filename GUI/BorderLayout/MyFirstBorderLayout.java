import java.lang.*;
//import java.util.ArrayList;

import java.awt.BorderLayout;

import javax.swing.*;



class MyFirstBorderLayout
{

	public static void main(String[] args)
	{
		JFrame frame=new JFrame("Border Layout");
		BorderLayout bl=new BorderLayout(2,2);
		frame.setLayout(bl);
		String [] value={"NORTH","SOUTH","EAST","WEST","CENTER"};
		JButton[] b=new JButton[5];
		for(int i=0;i<5;i++)
		{
			b[i]=new JButton(value[i]);
		}

		frame.add(b[0],BorderLayout.NORTH);
		frame.add(b[1],BorderLayout.SOUTH);
		frame.add(b[2],BorderLayout.EAST);
		frame.add(b[3],BorderLayout.WEST);
		frame.add(b[4],BorderLayout.CENTER);

		
		frame.setLayout(bl);
		frame.setSize(300,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}
		
