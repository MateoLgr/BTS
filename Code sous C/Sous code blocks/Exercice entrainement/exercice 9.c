#include <stdio.h>
#include <stdlib.h>
#include<string.h>
//CORRECTION
int main(){
    char *nom=malloc(255);
    printf("Veuillez inserer un mot : ");
    scanf("%s",nom);
    int cpt=0;
    while (*nom !=0){
        cpt++;
        nom++;
    }
    printf("Il y a %d lettres\n",cpt);
    nom-=cpt;
    free(nom);
    return 0;
}
