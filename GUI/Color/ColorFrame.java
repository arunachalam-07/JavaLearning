import java.lang.*;

import java.awt.Color;

import java.awt.Font;

import java.awt.GridLayout;

import javax.swing.*;



class ColorFrame
{
	public static void main(String[] args)
	{
		JFrame frame=new JFrame("Colorful Name");
		Color c1=new Color(124,252,0);
		frame.getContentPane().setBackground(c1);
		GridLayout g1=new GridLayout(2,2);
		frame.setLayout(g1);
	
		JButton button=new JButton("Click");
		Font font=new Font("Times New Roman",Font.ITALIC+Font.BOLD,20);
		button.setForeground(Color.RED);
		button.setBackground(Color.BLUE);
		button.setOpaque(true);
		button.setFont(font);

		frame.add(button);

		frame.setSize(300,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}
