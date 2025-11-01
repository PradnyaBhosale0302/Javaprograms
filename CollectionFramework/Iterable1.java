import java.util.*;
class Iterable1
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("Hii");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			String fruit = itr.next();
			System.out.println(fruit);
			if(fruit.equals("Hii"))
			{
				itr.remove();
			}
		}
		System.out.println(list);
	}
}