import java.util.Scanner;
class Printvowels
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int n = sc.nextInt();
		char ch[] = new char[n];
		for(int i=0; i<ch.length; i++)
		{
			ch[i] = sc.next().charAt(0);
		}
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
			{
				System.out.println(ch[i]);
			}
		}
	}
}