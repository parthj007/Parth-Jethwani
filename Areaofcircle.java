import java.util.Scanner;
public class Areaofcircle
{
public static void main(String []args)
		
{
//double radius;
double area;

double div;
double radius = 18;
final double PIE = 3.14;
Scanner input = new Scanner(System.in);


System.out.println("enter the value of radius");
radius=input.nextDouble();

div = 5.0/2;
System.out.println("the value"+div);


area =(radius*radius)*PIE;
System.out.println("Area of circle is:-"+area);
}
}

