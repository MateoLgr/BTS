#include <stdio.h>


int main(){
	float prixVoiture=20000.0;
	int annee=0;
	while (prixVoiture>2000.0){
		prixVoiture*=0.8;
		annee++;
	}
	printf("Voici le temps qu'a pris pour que la voiture sois a moins de 2k€ : %dans\n", annee);
	return 0;
}
