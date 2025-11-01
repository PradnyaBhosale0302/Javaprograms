import java.util.*;
class Iterable2
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("Hii");
		
		ListIterator<String> itr = list.listIterator();
		while(itr.hasNext())
		{
			String fruit = itr.next();
			if(fruit.equals("Hii"))
			{
				// itr.add("Byy");
				itr.set("Byy");
			}
			System.out.println(fruit);
		}
		while(itr.hasPrevious())
		{
			String fruit = itr.previous();
			System.out.println(fruit);
		}
	}
}