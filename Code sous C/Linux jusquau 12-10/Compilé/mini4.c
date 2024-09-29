#include <stdio.h>

int mini(float a, float b,float c,float d){
	if (ab<cd){
		return ab;
	}
	else{
		return cd;
	}
}

int main(){
	float a=0;
	float b=0;
	float c=0;
	float d=0;
	int res;
	printf("Inserez votre valeur pour A : \n");
	scanf("%f", &a);
	printf("Inserez votre valeur pour B : \n");
	scanf("%f", &b);
	printf("Inserez votre valeur pour C : \n");
	scanf("%f", &c);
	printf("Inserez votre valeur pour D : \n");
	scanf("%f", &d);
	res=mini(a,b,c,d);
	printf("Le plus petit est %d\n", res);
	return 0;
}
