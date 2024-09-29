#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int alea(int maxRand){

	return rand() %(maxRand+1);
	}

void echange(int *a, int *b){
	int c=*a;
	*a=*b;
	*b=c;
	}

int main(){
	
	srand(time(NULL));
	
	int tab[8];
	for(int i=0; i<8; i++){
		tab[i]=alea(99)+1;
	}
	
int n=sizeof(tab)/sizeof(int);
	for(int i=0;i<n-1;i++){
		for(int j=0;j<n-i-1;j++){
			if(tab[j]>tab[j+1]){
				echange(&tab[j],&tab[j+1]);
			}
		}
	}
	for(int i=0;i<n;i++){
	printf("%d\n",tab[i]);
	}
	
	return 0;
}
		
