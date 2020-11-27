package conditions;
import java.util.Scanner;
public class ques9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
	   
		for(int i =1;i<=n;i++) {
			int cube  = i*i*i;
			System.out.println("sum of "+i+" is: "+cube);
		}
		
		

	}

}
