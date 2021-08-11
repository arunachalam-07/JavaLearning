import java.lang.*;

import java.awt.*;

import javax.swing.*;

class PaintComponentClass extends JPanel
{
	protected void paintComponent (Graphics g)
	{
		g.drawLine(0,0,50,50);
		g.drawString("puma",23,67);
	}
}


class FirstDraw
{



	public static void main(String[] args)
	{
		JFrame frame=new JFrame("First Draw");

		PaintComponentClass g=new PaintComponentClass();
		frame.add(g);
		frame.setSize(300,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}
