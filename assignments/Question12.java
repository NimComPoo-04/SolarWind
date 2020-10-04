import java.util.Scanner ; 

public class Question12
{
	int[] val ;// this is the sorter ; 

	Question12(int[] val) // this is obj oriented... >:-(
	{
		this.val = val ;
	}
	
	void sortBub(int poss, int pose)
	{
		for( int i = poss ; i < pose ; i++)
		{
			for( int j = i ; j < pose ; j++) 
			{
				if( val[j] < val[i] )
				{
					int temp = val[j]; // for e...
					val[j] = val[i] ; 
					val[i] = temp ; 
				}
			}
		}
	}

	void sortSlec( int poss, int pose)
	{
		for( int i = poss ; i < pose ; i++)
		{
			int g = i ; 
			for( int j = i ; j < pose ; j++)
			{
				if( val[g] < val[j])
					g = j ;
			}

			int temp = val[g] ; 
			val[g] = val[i] ; 
			val[i] = temp ; 
		}
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in) ;
		int l = sc.nextInt() ;
		int[] m = new int[l] ;
		for( int i = 0 ; i < l ; i++)
		{
			m[i] = sc.nextInt() ; 	
		}
		Question12 q = new Question12(m) ; 
		System.out.println("") ; 
		q.sortBub(0, m.length/2) ; // sorting in the correct order
		q.sortSlec(m.length/2, m.length) ; // in the half

		disp(q.val) ;
	}

	public static void disp( int[] m)
	{
		System.out.print("\n[ ") ; 
		for( int i = 0 ; i < m.length ; i++)
		{
			System.out.print(m[i]+" ") ; 
		}
		System.out.println("]") ;
	}

}
