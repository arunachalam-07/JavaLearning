import java.lang.*;
import java.awt.GridLayout;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

class Rectangle extends JPanel
{
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawRect(130, 30,100, 80); 
		setForeground(Color.RED);
		setBackground(Color.BLUE);  
	}
}


class Circle extends JPanel
{
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawOval(30,130,50, 60);  
		setForeground(Color.RED);
		setBackground(Color.YELLOW);
	}
}

class Arc extends JPanel
{
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		 g.drawString("X",30, 200);  
		setForeground(Color.RED);
		setBackground(Color.GREEN);
	}
}

class Rectangle1 extends JPanel
{
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.fillRect(130,30,100,80);
		setForeground(Color.ORANGE);
		setBackground(Color.BLACK);
	}
}


class Circle1 extends JPanel
{
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.fillOval(30,130,50,60);
		setForeground(Color.GREEN);
		setBackground(Color.GRAY);
	}
}


class FiveGraphics
{
	public static void main(String[] args)
	{
		JFrame frame=new JFrame("5 drawings");
		GridLayout gl=new GridLayout(3,2);
		JPanel[] panel=new JPanel[5];
		for(int i=0;i<5;i++){panel[i]=new JPanel();}
		panel[0]=new Rectangle();
		panel[1]=new Circle();
		panel[2]=new Arc();
		panel[3]=new Rectangle1();
		panel[4]=new Circle1();

		for(JPanel p:panel)frame.add(p);
		frame.setLayout(gl);
		frame.setSize(1920,1080);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}

