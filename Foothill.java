import  java.util.Scanner;

public class Foothill
{
	public static void main(String args[])
   {
       int i,n,t;          

       Scanner sc=new Scanner(System.in);

       System.out.print("Enter the size of array ");

       n=sc.nextInt();

       int a[] = new int[n];

       System.out.println("Enter elements in array ");

       for(i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
       }
       t=a[1];

       for(i=0;i<n;i++)
       {
           if(a[i]>t)

               t=a[i];
       }
       System.out.println("Greates integer is " +t);
   }
}
