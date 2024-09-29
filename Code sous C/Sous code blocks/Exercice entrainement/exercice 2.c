#include<stdio.h>
// FINI
int main(){
    int i, d, res;
    printf("veuillez entrer un chiffre : ");
    scanf("%d", &i);
    printf("veuillez entrer un deuxième chiffre : ");
    scanf("%d", &d);
    if(d==0){
        printf("Erreur : division par 0");
    }
    else{
        res=i/d;
        printf("%d / %d = %d\n", i, d, res);
    }
    return 0;
}
