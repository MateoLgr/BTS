#include <iostream>
#include "personne.h"
using namespace std;

int main(){
	Personne p("Arthur",32);
	Personne c;
	c.setNom("Franck");
	c.setAge(20);
	cout<<"l'age de "<<c.getNom()<<" est de "<<c.getAge()<<" ans /n";
	cout<<"l'age de "<<p.getNom()<<" est de "<<p.getAge()<<" ans /n";
}	
