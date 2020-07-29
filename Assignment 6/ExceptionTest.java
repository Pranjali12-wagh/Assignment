package Demo;


public class ExceptionTest {
	
	public static void main(String[] args)
	{
		
		try
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=a/b;
			System.out.println(c);
		
		}
		catch(NumberFormatException e)
		{System.out.println("Only integers are allowed");}
		catch(ArithmeticException e)
		{System.out.println("Division with zero is not possible”");}
		catch(ArrayIndexOutOfBoundsException e)
		{System.out.println("No Input received");}
		
		
	}

}