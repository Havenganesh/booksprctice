import java.util.Scanner;
public class CircleArea
{
	final static double PI = 3.14;
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("eneter the value of the radius");
		double radius = input.nextDouble();
		System.out.println(radius*radius*PI);
	}
	
}