import java.util.Scanner ; 

public class Question10
{
	private int[] val  ; // this is the var which stors values...
	
	// this function inits the val using the val given by usr
	Question10(int[] val)
	{
		this.val = val ; 
	}

	/* This function to remove the val */
	int[] removeEle(int pos)
	{
		pos-- ; 
		if( pos < 0 && pos >= val.length) return null ; 
		int[] gg = new int[val.length-1] ;
	        for( int i = 0, g = 0 ; i < val.length ; i++)
		{
			if( i == pos ) continue ; 
			gg[g] = val[i] ; 
			g++ ; 
		}
		return gg ;	
	}

	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in) ; 
		System.out.println("Enter the len of array: ");
		int len = sc.nextInt() ; 
		System.out.println("Enter the eles of array: ");
		int[] p = new int[len] ; 
		for( int i = 0 ; i < len ; i++)
		{
			p[i] = sc.nextInt() ;
		}
		
		System.out.println("Enter the postition of the rm: ");
		int pos = sc.nextInt() ; 

		Question10 q = new Question10(p);
		System.out.print("Initial :") ; 
		q.disp(q.val) ; 
		q.val = q.removeEle(pos) ; 
		System.out.print("After rem: ");
		q.disp(q.val) ; 
		
	}
	
	/* This func displays the array...*/
	void disp(int[] adsf)
	{
		System.out.print("[ ");
		for( int i : adsf)
		{
			System.out.print(i+" ");
		}
		System.out.println("]") ; 
	}
}
