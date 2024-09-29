#include "digitalVersatileDisk.h"
#include <iostream>
using namespace std;
//constructeur de DVD
DigitalVersatileDisk::DigitalVersatileDisk(string titre, string auteur, string date, int duree, int taille):Media(titre,auteur,date,duree){
    this->taille=taille;
}
//Getteur de taille
int DigitalVersatileDisk::getTaille(){
    return taille;
}
//Setteur de taille
void DigitalVersatileDisk::setTaille(int){
    this->taille=taille;
}
