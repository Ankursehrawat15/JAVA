package conditions;
import java.util.Scanner;

public class PatternQues5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int i=1;
		int k =0;
		while(i<=n) {
			int j =1;
			while(j<=i) {
				System.out.print(++k+" ");
				j++;
			}
			System.out.println();
			i++;
			
			
		}

	}

}
