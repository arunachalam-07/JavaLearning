import java.lang.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.*;


class SamplePanel
{
	public static JPanel Panel1()
	{	GridLayout gl=new GridLayout(4,4);
		JPanel p1=new JPanel(gl);
		JButton[] button1=new JButton[12];
		for(int i=0;i<12;i++)
		{
			button1[i]=new JButton(i+"");
			p1.add(button1[i]);
		}
		return p1;
	}

	public static JPanel Panel2()
	{
		BorderLayout bl=new BorderLayout();
		JPanel p2=new JPanel(bl);
		JTextField tf=new JTextField();
		p2.add(tf,BorderLayout.NORTH);
		p2.add(SamplePanel.Panel1());
		return p2;
		
	}

	public static void MainFrame()
	{
		JFrame frame=new JFrame("Test Frame");

		JButton b=new JButton("click me");
		
		BorderLayout b2=new BorderLayout();
		frame.setLayout(b2);
		frame.add(b,BorderLayout.WEST);
		frame.add(SamplePanel.Panel2(),BorderLayout.EAST);

		frame.setSize(4,4);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
	public static void main(String[] args)
	{
		MainFrame();
	}
}
