import java.io.*;
//Here wewill handle it using try catch
class Exceptionhandling2
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			FileReader file = new FileReader("abc.txt");
			file.read();
			file.close();
		} catch(FileNotFoundException e)
		{
			System.out.println("File not found: " + e.getMessage());
		} catch(IOException e)
		{
			System.out.println("Error while reading the file: " + e.getMessage());
		} finally
		{
			System.out.println("File handling attempt completed.");
		}
	}
}