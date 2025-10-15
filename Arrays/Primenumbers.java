import java.util.Scanner;
class Primenumbers
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length; i++)
		{
			isPrime(arr[i]);
		}
	}
	public static void isPrime(int num)
	{
		int count = 0;
		for(int i=1; i<=num; i++)
		{
			if(num%i == 0)
			{
				count++;
			}
		}
		if(count == 2)
		{
			System.out.println(num + "Prime number");
		}
	}
}