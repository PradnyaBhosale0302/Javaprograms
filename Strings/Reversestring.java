import java.util.Scanner;
class Reversestring
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		// String str2 = "";
		// for(int i=str.length()-1; i>=0; i--)
		// {
			// str2 = str2+str.charAt(i);
		// }
		// System.out.println(str2);
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}
}