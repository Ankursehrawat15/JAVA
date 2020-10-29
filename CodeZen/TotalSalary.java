import java.util.Scanner;
import java.lang.Math; 
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
            char grade  = sc.next().charAt(0);
        double total_salary,hra,pf,da;
        int allow;
    
        hra = 0.2*basic;
        da = 0.5*basic;
        pf = 0.11*basic;
        
        if(grade == 'A'){
            allow = 1700;
            
        }else if (grade=='B'){
           allow = 1500;   
        }else {
            allow = 1300;
        }
        
        total_salary = hra + da + basic + allow -pf;
        
        System.out.println(Math.round(total_salary));
			      
        

	}
}
