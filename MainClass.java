import java.util.Formatter;

public class MainClass
{
	public static void main(String args[])
	{
	    Formatter fmt;

	    for (int i = 1; i <= 10; i++) {
	      fmt = new Formatter();

	      fmt.format("Square of %4d is %4d" ,i,i * i);
	      System.out.println(fmt);
	}

	}
}
