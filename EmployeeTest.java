import java.io.*;
public class EmployeeTest {

   public static void main(String args[]) 
   {
   	
      Employee empOne = new Employee("Robert Elias");
      Employee empTwo = new Employee("Cynthia G. Bracamonte");

      empOne.empAge(39);
      empOne.empDesignation("Senior Software Engineer");
      empOne.empSalary(250000);
      empOne.printEmployee();

      empTwo.empAge(36);
      empTwo.empDesignation("Software Engineer");
      empTwo.empSalary(200000);
      empTwo.printEmployee();
   }
}