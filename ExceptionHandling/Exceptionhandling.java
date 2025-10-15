import java.util.*;
//Here we are not handling exception, I will just declare it using throws
class Exceptionhandling1
{
	public static void main(String[] args) throws IOException
	{
		FileReader file = new FileReader(abc.txt);
		file.read();
		file.close();
	}
}