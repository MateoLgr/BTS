#include<stdio.h>
// FINI
int main(){
    int i=0;
    int d = 2;
    printf("Veuillez entrer un nombre : ");
    scanf("%d", &i);
    int reste = i % d;
    if(reste==0){
        printf("ce nombre est pair");
    }
    else{
        printf("ce nombre est impair");
    }
    return 0;
}
