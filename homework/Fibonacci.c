#include <stdio.h>

// defining the function myself because i don't like to increase the size of code 
// any more than it really needs to be
int atoi(char*) ;
void PrintSequenceFibo(int) ; 

int main(int argc, char** args)
{
	if( argc < 2 ) return 0 ;// handled the problem
       	int len = atoi(args[1]) ;
	PrintSequenceFibo(len);	
}

void PrintSequenceFibo(int n)
{
	int a = 0 ; 
	int b = 1 ; 
	for( int i = 0 ; i < n ; i++ )
	{
		printf("%d ",a);
		b = a+b ; 
		a = b-a ; 
	}
	puts("") ; 
}
