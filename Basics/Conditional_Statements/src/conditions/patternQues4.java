package conditions;
import java.util.Scanner;

public class patternQues4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc =new Scanner(System.in);
          int n = sc.nextInt();
          int i=1;
          
          while(i<=n) {
        	  int space = n-i;
        	  int j =1;
        	  while(j<=space) {
        		  System.out.print(" ");
        		  j ++;
        		  
        	  }
        	  int z =1;
        	  while(z<=i) {
        		  System.out.print(i+" ");
        		  z++;
        	  }
        	  System.out.println();
        	  i++;
        	  
        	  
        	  
        	  
        	  
          }
	}

}
