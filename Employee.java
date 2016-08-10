import java.util.Scanner;
public class Employee{
    String first;
    String last;
    double salary;
void get()
{
    Scanner input=new Scanner(System.in);
  first=input.next();
  last=input.next();
  salary=input.nextDouble();
  if(salary<0)
    set();
}
void set()
{
            System.out.print("Salary cannot be negative\nenter a valid salary");
            Scanner input=new Scanner(System.in);
            salary=input.nextDouble();
}
void yearly()
{
    System.out.println("the yearly salary is");
    salary=salary*12;
    System.out.println(salary);
}
void interest()
{
  double i;
  i=salary*0.1;
  salary=salary+i;
  System.out.println("the salary after increment");
  System.out.println(salary);
}
  Employee(){
        first=null;
        last =null;
        salary=0;
      }
public static void main(String[]args)
{
 Employee emp0=new Employee();
 Employee emp=new Employee();
  Scanner input=new Scanner(System.in);
 emp0.get();
 System.out.println(emp0.first);
 System.out.println(emp0.last);
 emp0.yearly();
 emp0.interest();
 emp.get();
 System.out.println(emp.first);
 System.out.println(emp.last);
 emp.yearly();
 emp.interest();
}
}
