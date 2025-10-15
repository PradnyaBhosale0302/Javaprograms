import java.util.Scanner;
class Perfectnumbers
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
			isPerfect(arr[i]);
		}
	}
	public static void isPerfect(int num)
	{
		int sum = 0;
		for(int i=1; i<num; i++)
		{
			if(num%i == 0)
			{
				sum = sum+i;
			}
		}
		if(sum == num)
		{
			System.out.println(num + "Perfect number");
		}
	}
}