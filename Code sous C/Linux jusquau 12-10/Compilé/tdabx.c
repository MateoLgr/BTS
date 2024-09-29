#include <stdio.h>

int noName (float a,float b, float x){
	int res=0;
	if ((a<=x) && (x<=b) || (b<=x) && (x<=a)){
		res=1;
	}
	return res;
}

int main(){
	float a=0;
	float b=0;
	float x=0;
	int res;
	printf("Entrez une valeur pour A : \n");
	scanf("%f", &a);
	printf("Entrez une valeur pour B : \n");
	scanf("%f", &b);
	printf("Entrez une valeur pour X : \n");
	scanf("%f", &x);
	res=noName(a,b,x);
	printf("%d\n", res);
	return 0;
}
