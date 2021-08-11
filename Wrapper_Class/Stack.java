import java.lang.*;
import java.util.Scanner;

class Stacks
{
	int size,top=-1;
	int[] arr;
	Stacks(int n)
	{
		size=n;
		arr=new int[n];
	}

	void display()
	{
		if(top ==-1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("Showing stack elements");
			for(int  i=0;i<size;i++)
			{	if(arr[i]==-1 )break;
				System.out.println(arr[i]);
			}
		}
	}


	void push(int ele)
	{
		if(top==size-1)
		{
			System.out.println("stack is full you can't enter");
		}
		else
		{	
			top++;
			arr[top]=ele;
		}
	}


	void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty.You can\'t enter elements");
		}
		else
		{
			System.out.println("popped element is"+arr[top]);
			arr[top]=-1;
			top--;
		}
	}


	void current_position()
	{
		if(top==-1)System.out.println("Stack is empty");
		else System.out.println("Current position is "+top);
	}

}

class Stack
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter no of elements in stack");
		n=sc.nextInt();
		Stacks s=new Stacks(n);

		while(true)
		{
			System.out.println("Choose options to perform operation");
			System.out.println("1.insert");
			System.out.println("2.delete");
			System.out.println("3.display");
			System.out.println("4.show current position");
			System.out.println("Enter -1 to exit");
			int opt=sc.nextInt();
			if(opt==-1)break;
			switch(opt)
			{
				case 1:
				int ele;
				System.out.println("Enter element");
				ele=sc.nextInt();
				s.push(ele);
				break;
				
				case 2:
				
				s.pop();
				break;

				case 3:
				System.out.println("Displaying elements");
				s.display();
				break;
				
				case 4:
				s.current_position();
				break;
			}
		}

	}
}
