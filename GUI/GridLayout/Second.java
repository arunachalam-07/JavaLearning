import java.lang.*;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;


class Second
{
	public static void main(String[] args)
	{
		JFrame frame=new JFrame("test GUI");
		GridLayout gl=new GridLayout(3,3,4,4);

		java.util.ArrayList<JLabel>label=new java.util.ArrayList<JLabel>();
		java.util.ArrayList<JTextField>tf=new java.util.ArrayList<JTextField>();


		for(int i=0;i<3;i++)
		{
			label.add(new JLabel("Label "+i));
			tf.add(new JTextField(8));
		}

		for(int i=0;i<3;i++)
		{
			frame.add(label.get(i));
			frame.add(tf.get(i));
		}
		frame.setLayout(gl);
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}
