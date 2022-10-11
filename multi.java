//WAP to crate three class, one class implemet the prime no prcess , second class implement the swapping of two no, third class imepelment the find out the average of student marks.
import java.util.Scanner;
class primenum 
{
public static void prime()
{
System.out.println("Class Prime Number");

int num1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Numbers"); 
num1=sc.nextInt();
if(num1%2==0)
{
System.out.println("The number is prime");
}
else
{
System.out.println("The is not a prime");
}
}
}
class Swap extends primenum 
{
public static void swapping() 
{
System.out.println("Class Swapping of Two Number");
int num1,num2,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter two Numbers");
num1=sc.nextInt();
num2=sc.nextInt();

c=num1;
num1=num2;
num2=c;
System.out.println("Number after swapping"+num1);
System.out.println("Number after swapping"+num2);
}
}
class Student extends Swap
{
public static void avge() 
{
System.out.println("Class Average of Student Marks");
int eng,math,sci,hindi,soci,avg;
Scanner sc= new Scanner(System.in);
System.out.println("Enter marks of 5 subject");
eng=sc.nextInt();
math=sc.nextInt();
sci=sc.nextInt();
soci=sc.nextInt();
hindi=sc.nextInt();
avg=(eng+math+sci+soci+hindi)/5;
System.out.println("The average of Student marks"+avg);
}
}
public class multi 
{
public static void main(String[] args) 
{
Student std = new Student();
std.prime();
std.swapping();
std.avge();
}
}