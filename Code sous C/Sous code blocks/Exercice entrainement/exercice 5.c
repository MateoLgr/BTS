#include <stdio.h>
//FINI
int main(){
    int tentative = 0;
    int i = 0;
    while(i!=4){
        tentative++ ;
        printf("Combien font 2x2 ?\n");
        printf("Ta reponse : ");
        scanf("%d", &i);
        if(i==4){
            printf("Bravo !\n");
            printf("Tu as trouvé en %d tentatives", tentative);
        }
        else{
            printf("faux, recommence !\n");
        }
    }
    return 0;
}
