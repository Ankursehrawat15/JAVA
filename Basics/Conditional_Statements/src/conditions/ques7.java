package conditions;
import java.util.Scanner;
public class ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		for(int i =1;i<=num;i++) {
			
			sum +=i;
			System.out.println(i);
		}
		System.out.println("sum of the number is "+sum);

	}

}
