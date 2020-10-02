#include <stdio.h>
#include <stdbool.h> // to avoid some ambiguity

struct Number
{
	int n;
} ; 	

bool isPrime(int) ; 

struct Number* Number(struct Number* num)
{
	num->n = 0 ;
}

void read__(struct Number* num)
{
	printf("Enter the data which is required: !!") ; 
	scanf("%d", &(num->n)); 
}

void dispTwin( struct Number* num)
{
	for( int i = 0 ; i < num->n ; i++)
	{
		if(isPrime(i) && isPrime(i+2))
			printf("%d %d\n",i,i+2) ; 
	}
}

int main(void)
{
	struct Number n;  
	Number(&n) ; 
	read__(&n) ;
        dispTwin(&n) ; 	
}

bool isPrime(const int n)
{
	if( n <= 1) return false ;

	for( int i = 2 ; i <= n/2 ; i++)
	{
		if( n % i == 0) return false ; 
	}
	return true ;
}
