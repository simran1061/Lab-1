import java.util.*;

public class program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the amount of positive numbers you want to add :");
	    n=sc.nextInt();
	    int arr[] = new int[n];
	    System.out.println("Enter the Numbers");
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        int total=0;
	        for(int i=0;i<n;i++)
	        {
	            total=total+arr[i];
	        }
	        //Display the total marks
	        System.out.println("The Sum of positive number is "+total);
	}
}

