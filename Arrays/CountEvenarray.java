import java.util.Scanner;
class CountEvenarray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int count = 0;
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2 == 0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}