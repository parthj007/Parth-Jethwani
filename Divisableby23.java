import java.util.Scanner;

import org.graalvm.compiler.lir.aarch64.AArch64ArrayEqualsOp;

public class Divisableby23 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("enter the number");
	int number = input.nextInt();
	if(number % 2==  0 && number % 3==0)
	{
	 System.out.println("number is divisable by both");
	}else if(number % 2== 0) {
	System.out.println("number is divisable by 2");
	}else if(number %3 ==0)
	{
		System.out.println("number is divisable by 3");
	}
	
}
}
