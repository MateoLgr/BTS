#include "personne.h"
#include <string>
using namespace std;

Personne::Personne(string nom, int a){
	this -> nom=nom;
	age=a;
}

Personne::Personne(){
}

string Personne::getNom(){
	return nom;
}

int Personne::getAge(){
	return age;
}

void Personne::setNom(string nom){
	this -> nom=nom;
}

void Personne::setAge(int age){
	this->age=age;
}

void Personne::feteAnniv(){
	age++;
}
