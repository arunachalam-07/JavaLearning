import java.lang.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridLayout;



class Counter implements ActionListener
{
	int i=0;
	JFrame frame=new JFrame("Increment Counter");
	GridLayout gl=new GridLayout(1,3);
	JButton button=new JButton("increment");
	JButton dbutton=new JButton("decrement");
	JTextField text=new JTextField();
	Counter()
	{
	button.addActionListener(this);
	dbutton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						i--;
						text.setText(String.valueOf(i));
					}
				}
						);
	frame.add(button);
	frame.add(text);
	frame.add(dbutton);
	frame.setLayout(gl);
	frame.setSize(300,300);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
	}
	public void actionPerformed(ActionEvent e)
	{
		i++;
		text.setText(String.valueOf(i));
	}

}


class IncrementCounter
{
	public static void main(String[] args)
	{
		Counter obj=new Counter();

	}
}
