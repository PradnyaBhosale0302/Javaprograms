import java.util.Scanner;
class SumOfevenarray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum = 0;
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2 == 0)
			{
				sum = sum+arr[i];
			}
		}
		System.out.println(sum);
	}
}