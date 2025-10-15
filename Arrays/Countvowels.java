import java.util.Scanner;
class Countvowels
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int n = sc.nextInt();
		char ch[] = new char[n];
		int count = 0;
		for(int i=0; i<ch.length; i++)
		{
			ch[i] = sc.next().charAt(0);
		}
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}