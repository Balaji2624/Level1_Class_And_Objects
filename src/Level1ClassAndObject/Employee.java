//Write a Java program to create a class called "Employee" with instance variables "name," "salary," and "ID."
//Include a method to calculate the employee's yearly salary and a method to print the employee's name and
//salary.

package Level1ClassAndObject;

public class Employee {
     String name;
     int salary;
     int Id;
     public Employee(String n,int sal,int id)
     {
    	 name=n;
    	 salary=sal;
    	 Id=id;
     }
     public int YearlySalary()
     {
    	 int yearlySal=salary*12;
    	 return yearlySal;
     }
     public void PrintDeatails()
     {
    	 System.out.println("Name of Employee :"+name);
    	 System.out.println("Salary of the Employee :"+salary);
    	 System.out.println("Yearly salary : "+YearlySalary());
     }
     public static void main(String args[])
     {
    	 Employee emp=new Employee("Balaji Sapkal",50000,2001);
    	System.out.println("Employee salary for month : "+emp.salary);
    	 emp.PrintDeatails();
     }
}
