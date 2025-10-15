class Exceptionhandling5
{
	public static void main(String[] args)
	{
		int age = 15;
		if(age<18)
		{
			throw new ArithmeticException("You must be 18");
		}
		else
		{
			System.out.println("You are eligible to vote");
		}
	}
}