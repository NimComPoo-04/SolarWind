import java.util.Scanner ; 

public class Question6
{
	/* TODO: finds the area of triangle with a,b,c */
	public double area(double a, double b, double c)
	{
		// doing a bit of maths and finding out that 
		// (a+b+c)/2 - a := (a+b+c - 2a)/2 := (b+c-a)/2
		// this was done to reduce the use of variables
		return Math.sqrt((a+b+c)/2 * (b+c-a)/2 * (a+c-b)/2 + (a+b-c)/2);
	}

	/* TODO: finds area with height and parellel sides in trapisium*/
	public double area(int a, int b, int height)
	{
		// area of /=\ using | and _ 
		return (a+b)*height/2 ; 
	}

	/* TODO: finds area with the diagonals */
	public double area(double a, double b)
	{
		// area of /=/ using X
		return (a*b)*0.5 ; 
	}

	public static void main(String args[])
	{
		Question6 q = new Question6() ; 
		Scanner sc = new Scanner(System.in) ; 
		System.out.println("Enter the sides of /\\");
		{
			double a = 0, b = 0, c = 0 ; 
			a = sc.nextDouble() ;		
			b = sc.nextDouble() ;		
			c = sc.nextDouble() ;
			System.out.println("Area of /\\ = "+area(a, b, c);
		}	
		System.out.println("Enter the sides of /=\\");
		{
			int a = 0, b = 0, c = 0 ; 
			a = sc.nextInt() ;		
			b = sc.nextInt() ;		
			c = sc.nextInt() ;
			System.out.println("Area of /=\\ = "+area(a, b, c);
		}
		System.out.println("Enter the sides of /=/");
		{
			double a = 0, b = 0; 
			a = sc.nextDouble() ;		
			b = sc.nextDouble() ;		
			System.out.println("Area of /=/ = "+area(a, b);
		}
	}
}
