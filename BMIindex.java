import java.util.*;
public class BMIindex {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	double wieght,height,BMI;
	System.out.println("Enter you wight in kilograms");
	wieght = sc.nextDouble();
	System.out.println("Enter you wight in meteres");
	height = sc.nextDouble();
	BMI= wieght/(height*height);
	System.out.println("your BMI is:"+BMI);
	
	if(BMI<18.5) {
		System.out.println("underwieght");
	}
	else if(BMI>=18.5 && BMI<=25.0)
	{
		System.out.println("Normal");
	}
	else if(BMI>=25.0 && BMI<=30.0)
	{
		System.out.println("overwieght");
	}
	else if(BMI>=30)
	{
		System.out.println("Obese");
	}
	
}
}
