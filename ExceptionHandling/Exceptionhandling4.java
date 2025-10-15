//Unchecked exception with handling
class Exceptionhandling4
{
	public static void main(String[] args)
	{
		try
		{
			int a = 10/0;
			System.out.println("Result:"+a);
		} catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by zero: "+e.getMessage());
		} finally
		{
			System.out.println("Done");
		}
	}
}