#include <stdio.h>
#define PI 3.14

float surface(float rayon) {
return PI*rayon*rayon;
}

int main(){
float rayon=0;
float res=0;
printf("Entrez votre rayon : \n");
scanf("%f", &rayon);
res=surface(rayon);
printf("Voici votre surface :%f\n", res);
return 0;
}

