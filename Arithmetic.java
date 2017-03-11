import java.util.Scanner; // Scanner is in the java.util package

public class Arithmetic
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();
		
		System.out.print("Enter a number for height: ");
		double height = input.nextDouble();
		
		double volume = radius * radius * height * 3.14159;
		
		System.out.println("The volume of a cylinder of radius: " + radius +
				" and height: " + height + " is: " + volume);
	}
}
