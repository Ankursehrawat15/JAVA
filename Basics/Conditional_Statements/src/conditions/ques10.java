package conditions;
import java.util.Scanner;
public class ques10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
     
        for(int i =1;i<=10;i++) {
         int prod = num * i;
         System.out.println(num+" X "+i+" = "+prod);
         
         
	}

}
}