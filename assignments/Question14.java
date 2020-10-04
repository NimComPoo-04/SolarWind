import java.util.Scanner ; 

public class Question14
{
	int data ; // This is the original data
	long info ; // This is the prossed info

	Question14(int data)
	{
		this.data = data ;
	}

	/* Finds the sum of each digit */
	int sunsum()
	{
		int dat = 0; 
		int data = this.data ; // for data security
		while( data != 0)
		{
			dat += data%10 ; 
			data/=10 ; 
		}
		return dat ;
	}

	/* apporaching the problem in a esier way cause i can */
	void granulate()
	{
		String dat = new Integer(data).toString() ; // this is a hack to make a str
		String output = "" + sunsum() ; // using a str

		for( int i = 0 ; i < dat.length()/2 ; i++)
		{
			// a geninue hack and know this is dogey but idc
			output += dat.charAt(i) + dat.charAt(dat.length()-1-i) - 2 * '0' ; 
		}
		
		// to add the lass digit in wierd nos...
		if(dat.length()%2 != 0) output+=dat.charAt(dat.length()/2) ; 

		this.info = Long.parseLong(output) ; 	
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in) ; 
		System.out.println("Enter the dat: ") ;
	       	int dat = sc.nextInt() ; 
		Question14 q = new Question14(dat) ;
		q.granulate() ; 
		System.out.println("The ouput : "+q.info) ; 	
	}
}
