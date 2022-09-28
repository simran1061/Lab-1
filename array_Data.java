import java.util.Scanner;

public class array_Data {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		accept_value();
		size_use();
		accept_name();
	}

	public static void accept_value()
	{
		int[] num=new int[5];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of 5 Subject");
		for(i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}

		System.out.println("The Marks are :");
		for(i=num.length-1;i>=0;i--)
		{
			System.out.println(num[i]);
		}
		
	}
	public static void size_use()
	{
		Scanner sc=new Scanner(System.in);
		int size,i;
		System.out.println("Enter the size");
		size=sc.nextInt();
		int roll_no[]=new int[size];
		System.out.println("Enter "+size+" roll Numbers:");
		for(i=0;i<size;i++)
		{
			roll_no[i]=sc.nextInt();
		}
		System.out.println("The Roll Numbers are");
		for(i=0;i<size;i++)
		{
			System.out.println(roll_no[i]);
		}
		
	}
	public static void accept_name()
	{
		Scanner sc=new Scanner(System.in);
		int size,i;
		System.out.println("Enter the size");
		size=sc.nextInt();
		String[] name=new String[size];
		System.out.println("Enter "+size+" names:");
		for(i=0;i<size;i++)
		{
			name[i]=sc.next();
		}
		System.out.println("The names are :");
		for(i=0;i<size;i++)
		{
			System.out.println(name[i]);
		}
	}
}
