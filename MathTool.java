import java.util.*;
public class MathTool {
	public static void main(String args[]) {
		Random randomGenerator=new Random();
		int no1 = randomGenerator.nextInt(10) + 1;
		int no2 = randomGenerator.nextInt(10) + 1;
		System.out.println("Perfrom Addition of "+no1+" And "+no2);
		int Add = no1 + no2;
		System.out.println("Enter the Answer");
		Scanner sc = new Scanner(System.in);
		int Answer = sc.nextInt();
		if(Add == Answer)
		{
			System.out.println("You are Right");
			
		}
		else
		{
			System.out.println("you are wrong.Answer is"+Answer);
			
		}
		
		
	}

}
