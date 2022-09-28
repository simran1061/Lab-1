//Write a program usinh array accept the size from the user than accordingly accept the no from the user and find out the greater no,smaller no, ascending, Descending
import java.util.*;

public class sorting {

public static void main(String[] args)
{
max_value();
min_value();
asc_order();
des_order();
}
public static void max_value()
{
  int n, max;
Scanner s = new Scanner(System.in);
System.out.print("Enter the number of elements in the array to find maximum value:");
n = s.nextInt();
int a[] = new int[n];
System.out.println("Enter the elements of array:");
for(int i = 0; i < n; i++)
{
a[i] = s.nextInt();
}
max = a[0];
for(int i = 0; i < n; i++)
{
if(max < a[i])
{
max = a[i];
}
}
System.out.println("Maximum value in the array is:"+max);

}
public static void min_value()
{
int n, min;
Scanner s = new Scanner(System.in);
System.out.print("Enter the number of elements in the array to find minimum value:");
n = s.nextInt();
int a[] = new int[n];
System.out.println("Enter the elements of array:");
for(int i = 0; i < n; i++)
{
a[i] = s.nextInt();
}
min = a[0];
for(int i = 0; i < n; i++)
{
if(min > a[i])
{
min = a[i];
}
}
System.out.println("Maximum value in the array is:"+min);

}
public static void asc_order()
{
int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
    }
public static void des_order()
{
int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] < a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Descending Order:");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
    }
}
