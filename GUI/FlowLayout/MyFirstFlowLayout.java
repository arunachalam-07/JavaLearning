import java.lang.*;
import java.awt.*;

import javax.swing.*;

import java.util.ArrayList;


class MyFirstFlowLayout
{
	MyFirstFlowLayout()
	{
		JFrame frame= new JFrame("Flow Layout");
		FlowLayout fl=new FlowLayout(FlowLayout.LEADING,3,3);
		
		ArrayList<JLabel> label=new ArrayList<JLabel>();
		ArrayList<JTextField>tf=new ArrayList<JTextField>();

		label.add(new JLabel("First"));
		label.add(new JLabel("Middle"));
		label.add(new JLabel("Last"));

		tf.add(new JTextField(8));
		tf.add(new JTextField(1));
		tf.add(new JTextField(8));


		for(int i=0;i<label.size() && i<tf.size() ;i++)
		{
			frame.add(label.get(i));
			frame.add(tf.get(i));
		}

		frame.setLayout(fl);
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

	}


public static void main(String[] args)
	{
		MyFirstFlowLayout obj =new MyFirstFlowLayout();			
	}
}



