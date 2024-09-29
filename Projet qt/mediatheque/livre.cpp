#include "livre.h"
#include <iostream>
using namespace std;
//Contructeur de livre
Livre::Livre(string titre, string auteur, string date, int duree, int nmbrPage, string editeur):Media(titre,auteur,date,duree){
    this->nmbrPage=nmbrPage;
    this->editeur=editeur;
}
//Getteur du nombre de pages
int Livre::getNmbrPage(){
    return nmbrPage;
}
//Getteur de l'editeur
string Livre::getEditeur(){
    return editeur;
}
