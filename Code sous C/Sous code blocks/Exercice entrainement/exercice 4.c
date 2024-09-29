#include <stdio.h>
//FINI
int main(){
    int i = 0;
    while(i!=4){
            printf("Combien font 2x2 ?\n");
            printf("Ta reponse : ");
            scanf("%d", &i);
        if(i==4){
            printf("Bravo !\n");
        }
        else{
            printf("faux, recommence !\n");
        }
    }
    return 0;
}





