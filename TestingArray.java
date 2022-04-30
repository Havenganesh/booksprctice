package pratice;

public class TestingArray 
{

	public static void main(String[] args) 
	{
		double [] mylist = {1.5,2.5,3.5,4.5,6.5,5.5};
		for(int i =0;i<mylist.length;i++)
		{
			System.out.println(mylist[i]+"  ");
		}
		double total = 0;
		for (int i = 0; i < mylist.length; i++) 
		{
			total += mylist[i];
		}
		System.out.println("Total is "+total);
		double max = mylist[0];
		for(int i= 1; i<mylist.length ; i++)
		{
			if (mylist[i] > max) max = mylist[i];
		}
		System.out.println("Max is " + max);
	}

}
