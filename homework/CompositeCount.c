#include <stdio.h>
#include <math.h>

void PrintIsComposite(int*) ; 
int main(void)
{
	int var = 10;
       	printf("Stupid Program and it will not stop until u enter 0") ;

	while( var != 0)
	{
		scanf("%d", &var) ;
		if( var == 0) return 0 ;
		PrintIsComposite(&var) ; 
	}	
}

void PrintIsComposite(int* asdf)
{
	int limit = (int)sqrt(*asdf)+1 ; 
	for( int i = 2  ; i < limit ; i++)
	{
		if( *asdf % i == 0)
		{
			puts( "Is composite !!") ; 
			return ;
		}
	}
	puts( "Is not composite!!") ; 
}
