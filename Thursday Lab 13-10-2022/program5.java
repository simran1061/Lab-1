/*Q4)
Write a program to accpet the positive numbers  from user and display the sum of that numbers using loop.
 */ 
import java.util.*;

public class program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the amount of positive numbers you want to add :");
	    n=sc.nextInt();
	    int arr[] = new int[n]; // taking array size from user and assigning to n integer
	    System.out.println("Enter the Numbers");
	        for(int i=0;i<n;i++) // using loop to assign int values
	        {
	            arr[i]=sc.nextInt();
	        }
	        int total=0;
	        for(int i=0;i<n;i++)
	        {
	            total=total+arr[i]; //addition of numbers in a array
	        }
	        //Display the total numbers
	        System.out.println("The Sum of positive number is "+total);
	}
}

