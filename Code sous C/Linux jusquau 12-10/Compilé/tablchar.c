#include<stdio.h>
#include<stdlib.h>
#include<string.h>

const char* doublemot(char* mot){
	int taille=sizeof(mot);
	char tab[taille*2-1];
	int j=0;
	for(int i=0; i<taille-1;i++){
		tab[j]=mot[i];
		tab[j+1]=mot[i];
		j+=2;
	}
	tab[taille*2-2]=0;
	char* doubleret=malloc(taille*2-1);
	strcpy(doubleret,tab);
	return doubleret;
}

int main(){
	char m[50];
	printf("Donnez un mot : ");
	scanf("%s",m);
	const char*s=doublemot(m);
	printf("%s\n",s);
	return 0;
}

