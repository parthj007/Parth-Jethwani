import java.util.*;

public class LoanCal {
public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double amount,total,intrest;
		int timeinmonths;
		System.out.println("Enter the Amount of Loan");
		amount = scan.nextDouble();
		System.out.println("Enter Intrest");
		intrest = scan.nextDouble();
		System.out.println("Enter Time of your Loan");
		timeinmonths = scan.nextInt();
		double emi= amount*intrest/(1+timeinmonths);
		System.out.println("Your monthly amount is"+emi);
		total = amount*timeinmonths;
		System.out.println("Your total amount is"+total);
}
}
