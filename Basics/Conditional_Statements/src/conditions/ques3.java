package conditions;
import java.util.Scanner;
public class ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
double n1= sc.nextDouble();
double n2= sc.nextDouble();

n1 = Math.round(n1*1000);
n1 = n1/1000;

n2 = Math.round(n2*1000);
n2 = n2/1000;

if(n1==n2) {
	System.out.println("Equal");
}else {
	System.out.println("not equal");
}
	}
}

	
		

