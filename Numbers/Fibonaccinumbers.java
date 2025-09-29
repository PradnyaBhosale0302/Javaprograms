class Fibonaccinumbers
{
	public static void main(String[] args)
	{
		int n = 8;
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		for(int i=1; i<=n; i++)
		{
			int c = a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}
}