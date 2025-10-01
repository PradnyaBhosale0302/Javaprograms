class Countdigits
{
	public static void main(String[] args)
	{
		int n = 12345;
		int count = 0;
		int temp = n;
		if(temp == 0)
		{
			count = 1;
		}
		else
		{
			while(temp != 0)
			{
				temp = temp/10;
				count++;
			}
		}
		System.out.println(count);
	}
}