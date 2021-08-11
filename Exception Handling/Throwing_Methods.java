import java.lang.*;


class Throwing_Methods
{


	public static void  Exception1() throws Exception
	{
		throw new Exception("Making an Exception");
	}


	public static void Exception2() throws Exception
	{
		Exception1();
	}

	public static void Exception3() throws Exception
	{
		Exception2();
	}


	public static void main(String[] args)
	{
		try
		{
			Exception3();
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
