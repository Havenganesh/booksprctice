package loop;
import java.util.Scanner;
public class Ifelsenested {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			System.out.println("please enter the mark");
			int mark = input.nextInt();
			
			if(mark>90)
			{
				System.out.println("the grade was S");
			}
			else if (mark>80)
			{
				System.out.println("the grade was A");	
			}
			else if (mark>70)
			{
				System.out.println("the grade was B");
			}
			else if (mark>60)
			{
				System.out.println("the grade was C");
			}
			else if (mark>50)
			{
				System.out.println("the grade was D");
			}
			else if (mark>34)
			{
				System.out.println("the grade was C");
			}	
			else if (mark<=34)
			{
				System.out.println("you are fail in this subject");
			}
		}
	}
}
