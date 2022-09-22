import java.util.Scanner;
public class palindrome  
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
System.out.print("Input a number: ");  //accept a variable
int n = in.nextInt();     //storing value in n
int sum = 0, r;         //declaring a variable sum as 0 and r as remainder
int temp = n;           // declaring temp as user variable that is storing user input to another variabe called temp
while(n>0)           // check if n is greater than zero if yes get in the loop or else declare as not a palindrome
{    
r = n % 10;        // store remainder in n after diving number with 10
sum = (sum*10)+r;    // for reversing a number store reverse value into sum variable
n = n/10;         // again divide remaining variable with 10
}    
if(temp==sum)    // check if user input is equal to reverse value if yes number is palindrome or else not a palindrome
System.out.println("It is a Palindrome number.");    
else    
System.out.println("Not a palindrome");    
}  
}