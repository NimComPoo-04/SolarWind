#include <stdio.h>
int atoi(char*) ;

int IsThere(int*,int,int) ; 

int main(int argc, char** args)
{
	int n ; int find ;  

	scanf("%d%d",&n,&find) ;  
	int array[n]; 

	for( int i = 0 ; i < n ; i++)
		scanf("%d",&array[i]) ;

	int dat = IsThere(array, find, n) ; 
	
	printf("%d\n",dat);
}

// implementing the binary search algo
int IsThere(int* array, int find, int len)
{
	int f = 0 ; int l = len-1 ; int mid = (f+l)/2 ;  
	while(f <= l)
	{
		if(array[mid] > find)
			f = mid ; 
		else if( array[mid] < find)
			l = mid ;
		else
			return mid ; 

		mid = (f+l)/2 ; 
	}
	return -1;
}
