
public class Patternstar {

	public static void main(String[] args) {
		Patternstar ps= new Patternstar();
		ps.pattern1();
		ps.pattern2();

	}

	private void pattern2() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=6-row;col++)
			{
				System.out.print(" "+" ");
			}
			for(int star=1;star<=row;star++)
			{
				System.out.print(" "+(star+row)+"  ");
			}
			System.out.println();
		}
		
	}

	private void pattern1() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--)
		{
			for(int col =1;col<=row;col++)
			{
				System.out.print(col +" ");
			}
			System.out.println();
		}
	}

}
