import java.util.Scanner;

public class OddOrEven 
{

	
	public void FindOddorEven() 
	{
		Scanner scObj = new Scanner(System.in);
		
		System.out.println("please Input a number");
		
		int number = scObj.nextInt();
		
		int Moduls = number%2;
		if(Moduls == 0) 
		{
			System.out.println(number + ": is a Even Number");
		}
		else
		{
			System.out.println(number + ": is a Odd Number");
		}
	}
}




