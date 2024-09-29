#include <stdio.h>

float remise(float pI, float pA)
	
	{float cal = 100-100*pA/pI;
	
	return cal;
}

int main() {
	float prix_init, prix_achat;
	
	printf("mon prix initial =");
	
	scanf("%f", &prix_init);

	printf("mon prix d'achat =");

	scanf("%f", & prix_achat);
	
	float ma_remise = remise( prix_init, prix_achat);
	
	printf("remis = %f", ma_remise);
	
	return 0;
}
