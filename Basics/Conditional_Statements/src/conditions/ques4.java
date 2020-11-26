package conditions;
import java.util.Scanner;
public class ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int month = sc.nextInt();
int year = sc.nextInt();

int no_of_days = 0;
  String monthname = "";
  
  switch(month) {
  
  case 1 :
	  monthname = "January";
	  no_of_days = 31;
	  break;
	  
  case 2 :
	  monthname = "February";
	  if(year%400==0 || year%4==0 && year%100!=0) {
	  no_of_days = 29;
	  }else {
		  no_of_days  =28;
	  }
	  break;
	  
  case 3:
	  monthname = "March";
	  no_of_days = 31;
	  break;
  case 4:
	  monthname = "April";
	  no_of_days = 30;
	  break;
  case 5:
	  monthname = "May";
	  no_of_days = 31;
	  break;
  case 6:
	  monthname = "June";
	  no_of_days = 30;
	  break;
  case 7:
	  monthname = "July";
	  no_of_days = 31;
	  break;
  case 8:
	  monthname = "August";
	  no_of_days = 31;
	  break;
  case 9:
	  monthname = "September";
	  no_of_days = 30;
	  break;
  case 10:
	  monthname = "october";
	  no_of_days = 31;
	  break;
  case 11:
	  monthname = "November";
	  no_of_days = 30;
	  break;
  case 12:
	  monthname = "December";
	  no_of_days = 31;
	  break;
	  
	  
	  
  }
  System.out.println(monthname+"   "+no_of_days+" days");
	}
}

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  
  


