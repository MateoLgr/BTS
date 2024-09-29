#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int alea(int maxRand)
{

    return rand() %(maxRand+1);
}


int main(){
	
	srand(time(NULL));
	
	int tab[50];
	for(int i=0; i<50; i++){
		tab[i]=alea(99)+1;
	}
	int mini=tab[0];
	for(int i=0; i<50; i++){
		printf("%d, ", tab[i]);
	}
	for(int i=0; i<50; i++){
		if(mini>tab[i]){
		mini=tab[i];
		}
	}
	printf("\n");
	printf("Le nombre le plus petit du tableau est : %d \n", mini);
	
return 0;
}

