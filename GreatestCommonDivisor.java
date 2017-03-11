import java.math.*;

public class GreatestCommonDivisor
{
	public static int computeGcd(int firstNumber, int SecondNumber) 
	{
		int gcd = 1;
		int k = 2;
		
		while (k <= firstNumber && k <= SecondNumber) {
			if (firstNumber % k == 0 && SecondNumber % k ==0)
				gcd =k;
			k++;
		}
		return gcd;
			
				
	}
	
	public static void main(String[] args)
	{
		
		System.out.println("The greatest common divisor is: " + computeGcd(16,12));
		System.out.println("The greatest common divisor is: " + computeGcd(125,25));
		System.out.println("The greatest common divisor is: " + computeGcd(15,60));
		System.out.println("The greatest common divisor is: " + computeGcd(125,2525));
		
	}
	
}
