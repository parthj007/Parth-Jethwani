import java.util.*;
public class ComputingTax {

public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	System.out.print("(0-single filer, 1-married jointly or " +
			 "qualifying widow(er), 2-married separately, 3-head of " +
			 "household) Enter the filing status: ");
	int status = input.nextInt();
	System.out.println("enter taxable income");
	double income = input.nextDouble();
	
	double tax = 0;
	if (status == 0) 
	{ // Compute tax for single filers
		 if (income <= 8350)
			 tax = income + (income * 0.1) ;
		 else if (income <= 33950)
			 
		 tax = income + (income * 0.15) ;
		 
		 else if (income <= 82250)
			 
			 tax = income + (income * 0.25) ;
		 
		 
		 else if (income <= 171550)
			 
			 tax = income + (income * 0.28) ;
		 
		 else if (income <= 372950)
			 
			 tax = income + (income * 0.33) ;
			 else
				 tax = income + (income * 0.35) ;
		 
	}
	else if(status==1) {
		if (income <= 16700)
			 tax = income + (income * 0.1) ;
		 else if (income <= 33950)
			 
		 tax = income + (income * 0.15) ;
		 
		 else if (income <= 67900)
			 
			 tax = income + (income * 0.25) ;
		 
		 
		 else if (income <= 137050)
			 
			 tax = income + (income * 0.28) ;
		 
		 else if (income <= 208850)
			 
			 tax = income + (income * 0.33) ;
			 else
				 tax = income + (income * 0.35) ;
	}
		else if(status == 2)
		{if (income <= 8350)
			 tax = income + (income * 0.1) ;
		 else if (income <= 33950)
			 
		 tax = income + (income * 0.15) ;
		 
		 else if (income <=68525)
			 
			 tax = income + (income * 0.25) ;
		 
		 
		 else if (income <= 104425)
			 
			 tax = income + (income * 0.28) ;
		 
		 else if (income <= 186475)
			 
			 tax = income + (income * 0.33) ;
			 else
				 tax = income + (income * 0.35) ;
		}
		else if(status ==3) {
			
			if (income <= 11950)
				 tax = income + (income * 0.1) ;
			 else if (income <=  45500)
				 
			 tax = income + (income * 0.15) ;
			 
			 else if (income <=117450)
				 
				 tax = income + (income * 0.25) ;
			 
			 
			 else if (income <= 190200)
				 
				 tax = income + (income * 0.28) ;
			 
			 else if (income <= 372950)
				 
				 tax = income + (income * 0.33) ;
				 else
					 tax = income + (income * 0.35) ;
		}
}
}
