import java.util.Scanner ; 

public class Question16
{
	private String val ; // this stores the data for the checking
	
	Question16(String val)
	{
		this.val = val.toUpperCase() ; // this makes up to uppercase 
	}

	int pair()
	{
		int pcount = 0 ; 

		for( int i =0 ;  i < val.length()-1 ; i++)
		{
			if( val.charAt(i) == val.charAt(i+1) )
				pcount++ ;
		}

		return pcount ;
	}

	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in) ; 
		System.out.println("Enter the data (do it now o_0): ") ;
	       	String s = sc.nextLine() ; 
		Question16 qe = new Question16(s) ; 
		int i = qe.pair() ;
	       	System.out.println("Output : "+i) ;	
	}
}
