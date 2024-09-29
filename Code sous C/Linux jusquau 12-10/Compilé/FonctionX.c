#include <stdio.h>

int somme (int res){
	int x=0;
	int somme;
		for(somme=0; somme<=res; somme++){
			x= x + somme;
		}
return x;
}
int main() {
 	int nbr;
 	printf("entrez votre nombre \n");
 	scanf("%d", &nbr);
 	int res=somme(nbr);
 	printf("%d \n",res);
 	return 0;
 	}

	
