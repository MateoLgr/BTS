#include <stdio.h>

int main(){

	int a, b, c;
	
	printf("veuillez rentrer un nombre pour a : ");
	scanf("%d", &a);
	printf("veuillez rentrer un nombre pour b : ");
	scanf("%d", &b);
	
	c=a;
	a=b;
	b=c;
	
	printf("Le b est devenue : %d Le a est devenue : %d \n",b ,a);
	
return 0;
}
