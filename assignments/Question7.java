import java.util.Scanner ; 

public class Question7
{
	private char ch ; 
	private int len ; 
	private int bre ; 

	Question7(char ch, int len, int bre)
	{
		this.ch = ch  ; 
		this.len = len ; 
		this.bre = bre ; 
	}

	public static void main(String args[])
	{
		char ch = 0 ; // this is the user choise of char 
		int len = 0 ; // this is the length of the box
		int bre = 0 ; // this is the bredth of the box
		Scanner sc = new Scanner(System.in) ; 
		
		System.out.println("Enter the charecter : ") ; 
		ch = sc.next().charAt(0) ; 
		System.out.println("Enter the len bre : ");
		len = sc.nextInt() ; 
		bre = sc.nextInt() ; 

		Question7 q = new Question7(ch, len, bre) ; 
		q.printStuff() ; 
	}

	/*This is the method prints the box in the __*/
	void printStuff()
	{
		for( int i = 0  ; i < len ; i++)
		{
			for( int j = 0 ; j < bre ; j++ )
			{
				if( i == 0 || i == this.len-1 || j == 0  || j == this.bre-1)
					System.out.print(ch) ;
			        else 
					System.out.print(" ") ; 	
			}
			System.out.println() ; 
		}
	}
}
