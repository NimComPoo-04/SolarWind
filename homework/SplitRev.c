#include <stdio.h>
#include <stdlib.h>

struct Vec
{
	char** a ; 
	int len ;
};

void SplitUp(struct Vec* v, char* c, int len)
{
	
}

int main(void)
{
	int len = 100 ; 
	char c[len];
       	getline(&c, &len, stdin) ;

	struct Vec v ;
	SplitUp(&v, c, len) ;
	
	for( int i = 0 ; i < v->len ; i++)
	{
		printf("%s ",v->a[i]);
	}

	free(vec->a) ; 
}
