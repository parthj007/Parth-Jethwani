import java.util.Scanner;
public class Tempconverter
{
public static void main(String []args)
{
double calcius;
Scanner ca = new Scanner(System.in);
double farh,kelv;
System.out.println("enter the calcius");
calcius = ca.nextDouble();
farh = ((calcius*9)/5)+32;
kelv=farh+273.15;
//farh = (calcius*1.8)+32;
System.out.println("calcius to farh is:-"+farh);
System.out.println("calcius to kelvin is:-"+kelv);
}
}

