import java.util.Scanner;

public class Assignment2_4 {
public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	int A,B,C;
	System.out.println("Enter the value of A:");
	A = in.nextInt();
	System.out.println("Enter the value of B:");
	B = in.nextInt();		
	System.out.println("Enter value of C");
	C = in.nextInt();
	in.close();
	if(A>B)
	{
		if(B>C){
			System.out.println("A is highest among all");
		}
		else
		{
			if(A>C)
			{System.out.println("A is highest among all");}
			else
				System.out.println("C is highest among all");
		}
	}
	if(B>A)
	{
		if(A>C){
			System.out.println("B is highest among all");
		}
		else
		{
			if(B>C)
			{System.out.println("B is highest among all");}
			else
				System.out.println("C is highest among all");
		}
		
		}
	
}
}
