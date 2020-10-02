#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char *lar ; int lenlar ; // this is the largest of all stuff  
char *sma ; int lensma ; // this is the smallest of all stuff

void DoStuff(char*) ;// this is the most important method

int main(void)
{
	lar = malloc(10) ; sma = malloc(10) ; 
	lenlar = 0 ; lensma = 0xfffff ;

	char* theLine ; // the real line of the agressive nature 
	size_t len  = 100; // the size of the line
	theLine = malloc(100) ; // no botheration for sizeof(char)

	getline(&theLine, &len, stdin) ;// gets the godam line
       	char* str = strtok(theLine, " ") ;// tokenizes the string

	while( str != NULL )
	{
		/* 
		 * ok that was fun to DEBUG :-< but lets get to work now
		 * printf("%s\n", str)  ; // this displays the stuff
		 */
		DoStuff(str) ; 
		str = strtok(NULL, " ") ; // this is the string tok
	}
	
	printf( "largest vow in my opi => %s\n", lar) ; 
	printf( "len of the largest => %d\n", lenlar) ; 
	printf( "largest vow in my opi => %s\n", sma) ; 
	printf( "len of the smallest=> %d\n", lensma) ; 

	free(sma) ; 
	free(lar) ; 
	free(theLine) ;
}

void DoStuff(char *word)
{
	int len = strlen(word) ;
       	int vowLL = 0 ;	
	for( int i = 0 ; i < len ; i++)
	{
		if( word[i] == 'a' ||
		    word[i] == 'e' ||
		    word[i] == 'i' ||
		    word[i] == 'o' ||
		    word[i] == 'u')
		{
			vowLL++ ; 	
		}
	}

	if( vowLL > lenlar)
	{
		lenlar = vowLL ; 
		strcpy(lar, word) ; 
	}
	if( vowLL < lensma)
	{
		lensma = vowLL ; 
		strcpy(sma, word) ; 
	}
}
