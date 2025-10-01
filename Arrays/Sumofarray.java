import java.util.Scanner;
class Sumofarray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int n = sc.nextInt();
		int sum = 0;
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length; i++)
		{
			sum = sum+arr[i];
		}
		System.out.println(sum);
	}
}