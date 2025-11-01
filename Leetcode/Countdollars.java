class Countdollars
{
	public static void main(String[] args)
	{
		String s = "abasababa";
		int countdollars1 = countdollars(s);
		System.out.println(countdollars1);
	}
	public static int countdollars(String s)
	{
		if(s.length() < 2)
		{
			return 0;
		}
		String sub = s.substring(0, 2);
		String replaced = s.replace(sub, "$");
		int count = 0;
		boolean isDollarDuplicate = false;
		for(int i=0; i<replaced.length(); i++)
		{
			char ch = replaced.charAt(i);
			if(ch == '$')
			{
				if(!isDollarDuplicate)
				{
					count++;
					isDollarDuplicate = true;
				}
			}
			else
			{
				isDollarDuplicate = false;
			}
		}
		return count;
	}
}