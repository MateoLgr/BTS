#include <stdio.h>

int main(){

	int a, b;

	printf("veuillez rentrer un nombre pour a : ");
	scanf("%d", &a);
	printf("veuillez rentrer un nombre pour b : ");
	scanf("%d", &b);
	
	a=(a+b);
	b=(a-b);
	a=(a-b);
	
	printf("Le b est devenue : %d Le a est devenue : %d \n",b ,a);

return 0;
}



	
