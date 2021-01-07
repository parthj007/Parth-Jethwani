import java.text.DecimalFormat;
import java.util.*;
public class DecimalPoint {

	public static void main(String[] args) {
		double tax;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Taxeble Amount");
		tax= scan.nextDouble();
		double Total = tax * 3.45;
		Total = Double.parseDouble(new DecimalFormat("###.#####").format(Total));
		System.out.println(Total);
		
	}
}
