package loop;
import java.util.Scanner;

public class Autoquiz {

	public static void main(String[] args) {
		int number1 = (int)(Math.random()*10);
		int number2 = (int)(Math.random()*10);
		if(number1<number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		System.out.println("what if "+number1+" - "+number2+" the answer");
		try (Scanner input = new Scanner(System.in)) {
			int answer = input.nextInt();
			if(number1-number2==answer)
			{
				System.out.println("Answer was right");
			}
			else
			{
				System.out.println("wrong Answer");
			}
		}	
	}
}
