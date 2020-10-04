import java.util.Scanner ; 

public class Question13
{
	long[] val ; 

	Question13(long[] val)
	{
		this.val = val ;
	}

	void sortSelecF()
	{
		for( int i = 0 ; i < val.length ; i++)
		{
			int g = i ; 
			
			for( int j = i ; j < val.length ; j++)
			{
				if(val[g] > val[j])
				       g = j ; 	
			}

			long temp = val[g] ; 
			val[g] = val[i] ; 
			val[i] = temp ; 
		}
	}

	int searchBinaryF(long ph)
	{
		int f = 0 ; int l = val.length  ; 

		while( f < l )
		{
			int mid = (f+l)/2 ; 
			if( val[mid] < ph)
				f = mid ; 
			else if( val[mid] > ph)
				l = mid ; 
			else
				return mid ; 
		}

		return -1 ;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the mobile no.") ;
		int l = sc.nextInt() ;
		long[] m = new long[l] ;
		for( int i = 0 ; i < l ; i++)
		{
			m[i] = sc.nextLong() ; 	
		}
		
		Question13 q = new Question13(m) ;
		q.sortSelecF() ;
		System.out.println("Enter the required ph. : ");
		long find = sc.nextLong() ; 
		int pos = q.searchBinaryF(find) ; 

		System.out.println(pos == -1 ? "Not Found!!" : "Found at : " + (pos+1));
	}

}
