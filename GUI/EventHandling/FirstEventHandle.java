import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


class ButtonEvent implements ActionListener
{
		int i=0;
			//event source
			//JButton button=new JButton("Click me");
			
			//registering an listener
			//button.addActionListener(ButtonEvent b);
			//button.addActionListener();
		
			//work to done
			JTextArea text=new JTextArea(String.valueOf(i));
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("action performed");
				++i;
			}

			public JTextArea clicked()
			{
				return text;
			}


}
class FirstEventHandle
{
	public static void main(String[] args)
	{
		JFrame frame=new JFrame("Event Handle");
		GridLayout gl=new GridLayout(2,2);
		JButton button=new JButton("Click me");
		//JTextField
		//JButton button=new JButton("click me");
		button.addActionListener(new ButtonEvent());

		frame.add(button);
		frame.add(new ButtonEvent().clicked());
		frame.setLayout(gl);
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
