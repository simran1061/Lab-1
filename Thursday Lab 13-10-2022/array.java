/* "Write a Java program to print an array after changing the rows and columns of a given two-dimensional array.

Original Array:
10 20 30
40 50 60
After changing the rows and columns of the said array:
10 40
20 50
30 60" */
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] twodm = {
		        {10, 20, 30},
		        {40, 50, 60} // defining array 
		    };
		    System.out.print("Original Array:\n");
		    print_array(twodm);
		    System.out.print("After changing the rows and columns of the said array:\n");
		    transpose(twodm);
		    }
		  
		  private static void transpose(int[][] twodm) {
		    
		    int[][] newtwodm = new int[twodm[0].length][twodm.length];
		    //for loop to flip the 2d array into newtwodm array
		    for (int i = 0; i < twodm.length; i++) {
		      for (int j = 0; j < twodm[0].length; j++) {
		        newtwodm[j][i] = twodm[i][j];
		      }
		    }
		    
		    print_array(newtwodm);
		  }
		  //Function to print new flipped 2d array
		  private static void print_array(int[][] twodm) { // changing the rows and columns of the program
		    for (int i = 0; i < twodm.length; i++) {
		      for (int j = 0; j < twodm[0].length; j++) { // using for loop to change the length
		        System.out.print(twodm[i][j] + " ");
		      }
		      System.out.println();
		    }

	}

}
