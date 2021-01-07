import java.util.*;
public class LeapYearorNOT {
public static void main(String[] args) {
	System.out.println("Enter the Year");
	Scanner input = new Scanner(System.in);
	int year = input.nextInt();
	if(year % 4 ==0 && year%100 != 0) {
		System.out.println("Year is Leap");
		
	}else
		System.out.println("Year is not leap");
	
	
	
}
}
