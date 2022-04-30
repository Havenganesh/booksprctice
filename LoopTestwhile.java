package pratice;

public class LoopTestwhile 
{

	public static void main(String[] args) 
	{
		int [] numbers = {10,20,30,40};
		for(int x : numbers)
		{
			if (x==30)
			{
				break;
			}
			System.out.println(x);
		}

	}

}
