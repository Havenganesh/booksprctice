package pratice;

public class Loop1 {

	public static void main(String[] args) 
	{
		Loop1 test = new Loop1();
		test.checkWhile();
	}

	private void checkWhile() 
	{
		int coin = 0;
		int capacity =50;
		while(coin<capacity)
		{
			System.out.println("the day "+coin);
			coin = ++coin;
			System.out.println("Money collected in the Bank");
			System.out.println("amount in bank "+coin);
		}
		System.out.println("bank was full,total amount was :"+coin);
	}
}
