#include <stdio.h>

#define abssba(a) (a < 0 ? -1*a : 1*a)

void Patternf( int dat )
{
	for(int i = -dat ; i <= dat ; i++)
	{
		for( int j = 0 ; j <= dat-abssba(i) ; j++)
		{
			printf("*") ;
		}
		puts("");
	}
}

int main(void)
{
	int dat = 0 ;
	printf("Enter the data : ") ;
	scanf("%d", &dat) ;

	Patternf(dat) ;
}
