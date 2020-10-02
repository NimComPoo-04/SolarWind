#include <stdio.h>

#define hello fudge

void Patternf(int) ;
inline int abssba(int) ;

int main(void)
{
	int dat = 0 ;
	printf("Enter the data : ") ;
	scanf("%d", &dat) ;

	Patternf(dat) ;
}

void Patternf( int dat )
{
	for(int i = -dat ; i <= dat ; i++)
	{
		for( int j = 0 ; j <= dat-abssba(dat) ; j++)
		{
			printf("*") ;
		}
		puts("");
	}
}

inline int abssba( int val )
{
	return val * (val < 0 ? -1 : 1);
}
