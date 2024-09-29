#include <stdio.h>

int mini(float a, float b){
	if (a<b){
		return a;
	}
	else{
		return b;
	}
}



int main(){
	float a=0;
	float b=0;
	int res;
	printf("Inserez votre valeur pour A : \n");
	scanf("%f", &a);
	printf("Inserez votre valeur pour B : \n");
	scanf("%f", &b);
	res=mini(a,b);
	printf("Le plus petit est %d\n", res);
	return 0;
}
