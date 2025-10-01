class Strongnumber
{
	public static void main(String[] args)
	{
		int n = 145;
		int temp = n;
		int sum = 0;
		while(temp != 0)
		{
			int rem = temp%10;
			sum = sum+fact(rem);
			temp = temp/10;
		}
		System.out.println(sum);
		if(sum == n)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("Not strong number");
		}
	}
	public static int fact(int num)
	{
		int factorial = 1;
		for(int i=1; i<=num; i++)
		{
			factorial = factorial*i;
		}
		return factorial;
	}
}