package conditions;
import java.util.Scanner;
public class ques11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum =0;
		int counter = 0;
		for(int i =1;i>0;i++) {
			
			if(i%2!=0) {
				System.out.println(i);
				sum +=i;
				counter++;
			}
			
			if(counter==num) {
				break;
			}
			
			
		}
		
		System.out.println("sum of odd numbers is: "+sum );
	}

}
