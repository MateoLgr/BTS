#include "compactDisk.h"
#include <iostream>
using namespace std;

//constructeur du CD
CompactDisk::CompactDisk(string titre, string auteur, string date, int duree, int taille):Media(titre,auteur,date,duree){
    this->taille=taille;
}
//Getteur de taille
int CompactDisk::getTaille(){
    return taille;
}
//Setteur de taille
void CompactDisk::setTaille(int taille){
    this->taille=taille;
}
