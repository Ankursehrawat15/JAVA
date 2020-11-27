package conditions;
import java.util.Scanner;

public class ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum =0;
		float avg;
		
		for(int i =1;i<=5;i++) {
			int num = sc.nextInt();
			
			sum+=num;
		}
		System.out.println("Sum of thhe number is: "+sum);
		avg = (sum/5);
System.out.println("Avg of number is "+avg);
	}

}
