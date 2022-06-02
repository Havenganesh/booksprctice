import java.util.Scanner;
public class BinaryNum {

	public static void main(String[] args) 
	{
		Scanner ip = new Scanner(System.in);
		System.out.println("please enter the  binary Number");
		int a = ip.nextInt();
		BinaryNum bn = new BinaryNum();
		bn.convertor(a);
		ip.close();
	}
	public void convertor(int a)
	{
		int result = 0;
		while(a>0) 
		{
		int copy = a;
		int n= -1;
		int div =1;
		int value = 1;
		while(a>0)
		{
			a=a/10;
			n++;
		}
		while(n>0)
		{
			div = div*10;
			value = value*2;
			n--;
		}
		//System.out.println("the div "+div);
		//System.out.println("the value is"+value);
		if(copy>0) 
		{
			copy =copy%div;
			result=result+value;
		}
		a=copy;	
	}
		System.out.println(result);
	}

}
