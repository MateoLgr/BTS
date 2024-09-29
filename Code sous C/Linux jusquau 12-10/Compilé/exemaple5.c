#include <time.h>
#include <stdio.h>
#include <stdlib.h>

int alea (int maxRand)
{
	return rand()%(maxRand+1);
}

int main() {
	srand(time(NULL));
    int val_sai;
    int mon_alea=alea(10);
    int cpt=0;
    do{
	    printf("Donnez une valeur entre 0 et 10");
	    scanf("%d",& val_sai);
	    cpt++;
	    if(mon_alea>val_sai){
		    printf("Le chiffre que tu cherches est suppérieur");
		    }
	    else if(mon_alea<val_sai){
		    printf("Le chiffre que tu cherches est infférieur"); 
        }
        }while((cpt<10)&&(mon_alea!=val_sai));
	    if(mon_alea==val_sai){
		    printf("Tu as gagné !\nvous avez passé %d tours",cpt);
		    }
	    else{
		    printf("Tu as perdu !");
		    }
	    return 0;
	    }


