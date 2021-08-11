import java.lang.*;
import java.util.Scanner;

class DayPredictor
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number of day");
		n=sc.nextInt();
		System.out.println("Enter the number of days after that day");
		int n1=sc.nextInt();
		int n2=(n+n1)%7;
		switch(n2)
		{
			case 0:
				System.out.println("after "+n1+"  days"+" is = sunday");
					break;
			 case 1:
                                System.out.println("after "+n1+"  days"+" is = monday");
                               		 break;
			 case 2:
                                System.out.println("after "+n1+"  days"+" is = Tuesday");
                                	break;
			 case 3:
                                System.out.println("after "+n1+"  days"+" is = Wednesday");
                                	break;
			 case 4:
                                System.out.println("after "+n1+"  days"+" is = Thursday");
                               		 break;
			 case 5:
                                System.out.println("after "+n1+"  days"+" is = Friday");
                                	break;
			case 6:
				System.out.println("after "+n1+" days"+" is= Saturday");
					break;
	}

	}
}




