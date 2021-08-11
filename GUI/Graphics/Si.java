import java.lang.*;
import javax.swing.*;

class Si
{

float p,n,r;

	public static void main(String[] args)
	{

		float p=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter principal amount"));
		float n=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter no of years"));
		float r=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter rate of interest"));
		JOptionPane.showMessageDialog(null,"Amount is"+String.valueOf((p*n*r)/100));
	}
}
