import java.util.*; 
public class reverse {
	public static void rev () {
		int num,revnum=0,rem;
	    //Getting input from user
	    System.out.println("Enter the Number : ");
	    Scanner sc = new Scanner(System.in);
	    num=sc.nextInt();
	    //Initializing Original number
	    int orinum=num;
	    //Using while loop to reverse the number
	    while(num != 0) {
	      rem=num%10;
	      revnum=revnum*10+rem;
	      num /= 10;
	    }
	    System.out.println("Reverse of "+orinum+" is "+revnum);
	}

}
