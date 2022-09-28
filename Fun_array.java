import java.util.Scanner;

public class Fun_array {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Fun_array obj=new Fun_array();
		obj.disp();
	}
	public int[] accept()
	{
		Scanner sc=new Scanner(System.in);
		int size,i;
		System.out.println("Enter the size");
		size=sc.nextInt();
		int roll_no[]=new int[size];
		System.out.println("Enter "+size+" Numbers:");
		for(i=0;i<size;i++)
		{
			roll_no[i]=sc.nextInt();
		}
		return roll_no;
	}
	
	public void disp()
	{
		int[] num=accept();
		int i;
                System.out.println("The list of numbers are" );
		for(i=0;i<num.length;i++)
      
		{
                       
			System.out.println( num[i]);
		}
	}
	

}

