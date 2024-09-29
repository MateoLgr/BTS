#include <stdio.h>

int main() {

int cpt=2;
 {
	printf("%d \n", cpt);
	int cpt=3;
	{
		printf("%d \n", cpt);
		cpt=4;
		}
	printf("%d \n", cpt);
}
printf("%d \n", cpt);
}
