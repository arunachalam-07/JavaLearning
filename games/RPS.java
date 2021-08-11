import java.lang.*;
import java.util.*;

class rps
{
	int i;
	String[] arr={"rock","paper","scissor"};
	Scanner sc=new Scanner(System.in);
	String guess,choice;
	void game()
{
	while(true)
	{
	Random rand=new Random();	
	choice=arr[rand.nextInt(3)];
	System.out.println("Guess or Enter -1 to exit");
	guess=sc.next();
	if(guess.equals("rock") & choice.equals("paper"))
	{
		System.out.println("Computer wins->paper can be roll over rock");
		System.out.println("You lose");
	}
	else if(guess.equals("rock") & choice.equals("scissor"))
	{	
		System.out.println("user wins->scissor brokes rock");
		System.out.println("Computer lose");
	
	}

	else if(guess.equals("paper") & choice.equals("rock"))
	{ 
		System.out.println("User wins -> paper can be roll over rock");
		System.out.println("Computer lose");
	}

	else if(guess.equals("paper") & choice.equals("scissor"))
	{
		System.out.println("Computer wins -> scissor can cut paper");
		System.out.println("You lose");
	}

	else if(guess.equals("scissor") & choice.equals("rock"))
	{
		System.out.println("Computer wins-> rock can broke scissor");
		System.out.println("You lose");
	}

	else if(guess.equals("scissor") & choice.equals("paper"))
	{
		System.out.println("User wins -> scissor can cut paper");
		System.out.println("Computer lose");
	}
	else if(guess.equals("rock") & choice.equals("rock"))System.out.println("tie! Try again");
	else if(guess.equals("paper") & choice.equals("paper"))System.out.println("tie! Try again");
	else if(guess.equals("scissor")&choice.equals("scissor"))System.out.println("tie! Try again");
	if(guess.equals("-1"))break;
	}
}

}
class RPS
{
	public static void main(String[] args)
	{
		System.out.println("!!!!Game starts!!!!");
		rps r=new rps();
		r.game();
		System.out.println("Thanks for playing");
	}
}
