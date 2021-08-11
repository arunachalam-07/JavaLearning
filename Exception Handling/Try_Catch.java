import java.lang.*;



class Try_Catch
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Yeah! it's working ");
			//String s=null;
			//System.out.println(s.charAt(2));
			throw new Exception("Throwing an exception");
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}

		finally
		{
			System.out.println("Successfully throwing an exception");
		}
	}
}

