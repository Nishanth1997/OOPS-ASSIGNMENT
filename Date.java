import java.util.Scanner;
public class Date
{
 int day;
 int month;
 int year;
 void set()
 {
  Scanner da=new Scanner(System.in);
  day=da.nextInt();
  month=da.nextInt();
  year=da.nextInt();
 }
 int getday()
 {
  return day;
 }
 int getmonth()
 {
     return month;
 }
 int getyear()
 {
     return year;
 }
 void display()
 {
  System.out.printf("%d/%d/%d",getday(),getmonth(),getyear());
 }
 Date()
 {
  day=0;
  month=0;
  year=0;
 }
 public static void main(String[]args)
 {
  Date d=new Date();
  System.out.println("Enter the day,mouth and year");
  d.set();
  d.display();
 }
}
