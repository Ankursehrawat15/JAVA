package conditions;
import java.util.Scanner;
public class PatternQues6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc =new Scanner(System.in);
       int n = sc.nextInt();
       int i =1;
       while(i<=n) {
    	   
    	  int z =1;
    	  int spaces = i-1;
    	  while(z<=spaces) {
    		  System.out.print(" ");
    		  z++;
    	  }
    	   
    	   
    	   
    	   int j =1;
    	   while(j<=(n-i+1)) {
    		   System.out.print("*");
    		   j++;
    	   }
    	   System.out.println();
    	   i++;
       }
	}

}
