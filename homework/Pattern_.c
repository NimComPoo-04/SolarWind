#include <stdio.h>

void PrintTheStuff(int);
int main(void)
{
	int asdf ; 
	printf("Enter -> :") ; 
	scanf("%d", &asdf) ; 

	PrintTheStuff(asdf) ; 
}

void PrintTheStuff(int d)
{
	for( int i = 0 ; i < d ; i++)
	{
		for( int j = 0 ; j < d ; j++)
		{
			printf("%d", (d-(j+i)%d)) ; 
		}
		puts("") ;
	}
}
