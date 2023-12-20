import java.util.Scanner;

public class MultiplicationTable
{
	public static void main (String args[])
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number for which table is required. Number = ");
		int num = reader.nextInt();
		for (int i=1; i<11; i++)
		{
			System.out.print(num + " x " + i + "  = " + num*i + "\n");
		}
	}
}


//Output:
//Enter the number for which table is required. Number = 5
//3x 1  = 3
//3 x 2  = 6
//3 x 3  = 9
//3 x 4  = 12
//3 x 5  = 15
//3 x 6  = 18
//3 x 7  = 21
//3 x 8  = 24
//3 x 9  = 27
//3 x 10  = 30
