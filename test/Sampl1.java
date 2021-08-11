import java.lang.*;
import java.util.*;

class Sampl1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		long num=sc.nextLong();
		int digits=0;
		ArrayList<String> str=new ArrayList<String>();
		String[] word=new String[]{"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
		String[] eleven=new String[]{"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
		String[] twenty=new String[]{"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty","one hundred"};
		for(int i=1;i<=9;i++)
		{
		if((long)Math.pow(10,i)>=num &  (long)Math.pow(10,i-1)<=num)
		{
			digits=i;
			break;
		}
		}
		System.out.println(digits);

		for(int i1=1;i1<=digits;i1++)
		{
			long n=num%(int)Math.pow(10,i1);
			if(n==0)str.add(word[i1]+"dollars");

			for(long  i2=(long)Math.pow(10,i1-1);i2<=(long)Math.pow(10,i1);i2++)
			{
				if(i2==n)
				{
					str.add(new String(word[(int)i2]+" dollars"));
				}
				
				if(i2>=Math.pow(10,1) & i2<=Math.pow(10,2))
				{
					if(i2>=11 && i2<=19)
					{
						for(int i=1;i<=9;i++)
						{
							if(n==(10+i))
							{
								str.add(new String(eleven[i-1]));
							}
						}
					}
			}


			}

		}

		
			for(String ele:str)System.out.println(ele);
	}

}

