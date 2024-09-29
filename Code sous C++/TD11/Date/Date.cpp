#include "Date.h"
#include <string>
using namespace std;

Date :: Date(int jour, string mois, int annee){
	jour = j;
	this -> mois = mois;
	annee = a;
}

int Date :: getJour(){
	return jour;
}

string Date :: getMois(){
	return mois;
}

int Date :: getAnnee(){
	return annee;
}

void Date :: setJour(int jour){
	this -> jour = jour;
}

void Date :: setMois(string mois){
	this -> mois = mois;
}

void Date :: setAnnee(int annee){
	this -> annee = annee;
}

