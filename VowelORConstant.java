import java.util.*;
public class VowelORConstant {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the alphabet");
	char Alpha = scan.next().charAt(0);
	if(Alpha == 'a'  || Alpha == 'e'|| Alpha == 'i'|| Alpha == 'o'|| Alpha == 'u'||Alpha == 'A'  || Alpha == 'E'|| Alpha == 'I'|| Alpha == 'O'|| Alpha == 'U' )
	{
		System.out.println("Charcter is Constant");
	}
	else
	{
		System.out.println("Charcter is constant");
	}
}
}
