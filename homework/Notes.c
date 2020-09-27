#include <stdio.h>
int atoi(char*) ; // to avoid messier code and more stuff than required

struct Notes // stores the notes
{
	int n500 ; 
	int n100 ; 
	int n50  ;
	int n20  ;
	int n10  ; 
	int n5   ;
	int n2   ;
	int n1   ;
};

void FindStuffFunc(struct Notes*, int) ; 

int main(int argc, char** args)
{
	if( argc < 2 ) return 0  ; 
	int money = atoi(args[1]) ; 
	
	struct Notes notary ; 

	// find stuff func
	FindStuffFunc(&notary, money) ; 
	
	// printing the notary for good
	printf("500 notes -> %d\n", notary.n500) ; 
	printf("100 notes -> %d\n", notary.n100) ; 
	printf("50  notes -> %d\n", notary.n50 ) ; 
	printf("20  notes -> %d\n", notary.n20 ) ; 
	printf("10  notes -> %d\n", notary.n10 ) ; 
	printf("5   notes -> %d\n", notary.n5  ) ; 
	printf("2   notes -> %d\n", notary.n2  ) ; 
	printf("1   notes -> %d\n", notary.n1  ) ; 
}

void FindStuffFunc(struct Notes* n, int m)
{
	n->n500 = m/500 ; 
	m%=500 ; 
	n->n100 = m/100 ; 
	m%=100 ; 
	n->n50 = m/50 ; 
	m%=50 ; 
	n->n20 = m/20 ; 
	m%=20 ;    
	n->n10 = m/10 ; 
	m%=10 ; 
	n->n5 = m/5 ; 
	m%=5 ; 
	n->n2 = m/2 ; 
	m%=2 ; 
	n->n1 = m ;
}
