#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void Tokenize_word(char*, int, char);
int nextToken(char*, int, int, char*, int) ; 

int main(void)
{
	printf("Enter the no. of acomadors....") ;

	int pos = 0 ; 
       	size_t siz = 100 ; 
	char* f = malloc(sizeof(char)*100) ;
	char word[10] ;

	getline(&f, &siz, stdin);
	Tokenize_word(f, siz, ' ') ;

	pos = nextToken(f, siz, 0, word, 10) ; 
	printf("%s\n%d\n",word,pos);
	pos = nextToken(f, siz, pos+2, word, 10) ; 
	printf("%s\n%d\n",word,pos) ;

	free(f);
}

int nextToken(char* c, int len, int pos, char* word, int lenw)
{
	int lea = strlen(c+pos) ;
	strcpy(word, c);
	return lea ; 
}

void Tokenize_word(char* c, int len, char cs)
{
	for( int i = 0 ; i < len ; i++)
	{
		if( c[i] == cs ) c[i] = 0 ; 
	}
}
