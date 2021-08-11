import java.lang.*;
import java.awt.GridLayout;

import javax.swing.*;

import java.util.ArrayList;

class MyFirstGridLayout
{


	MyFirstGridLayout()
	{
		JFrame frame=new JFrame("Grid Layout");
		GridLayout gl=new GridLayout(3,3);
		frame.setLayout(gl);
		frame.setVisible(true);
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

		ArrayList<JLabel>label=new ArrayList<JLabel>();
		ArrayList<JTextField>textbox=new ArrayList<JTextField>();

		label.add(new JLabel("first"));
		label.add(new JLabel("middle"));
		label.add(new JLabel("last"));

		textbox.add(new JTextField(8));
		textbox.add(new JTextField(1));
		textbox.add(new JTextField(8));


		for(int i=0;(i<label.size() & i<textbox.size());i++)
		{
			frame.add(label.get(i));
			frame.add(textbox.get(i));
		}


	}
	public static void main(String[] args)
	{

		Object obj=new MyFirstGridLayout();
	}
}
