import java.util.*;
public class DecresingOrderInt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three integer seperated by integer");
		String s1 = scan.next();
		String s2 = scan.next();
		String s3 = scan.next();
		 Integer array[] = new Integer [3];
		array[0] = Integer.parseInt(s1);
		array[1] = Integer.parseInt(s2);
		array[2] = Integer.parseInt(s3);
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println("No in decresing order"+Arrays.toString(array));
		
		
				
				
		
	} 

}
