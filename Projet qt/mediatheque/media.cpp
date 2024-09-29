#include "media.h"
#include <iostream>
using namespace std;

//constructeur par defaut
Media::Media(){
}
//Constructeur de Media
Media::Media(string titre, string auteur, string date, int duree){
    this -> titre=titre;
    this -> auteur=auteur;
    this -> date=date;
    this -> duree=duree;
}
//Getteur d'un titre
string Media::getTitre(){
        return titre;
    }
//Getteur d'un auteur
string Media::getAuteur(){
        return auteur;
    }
//Getteur d'une date
string Media::getDate(){
        return date;
    }
//Getteur d'une duree
int Media::getDuree(){
        return duree;
    }
//Setteur d'un titre
void Media::setTitre(string titre){
    this->titre=titre;
}
//Setteur d'un auteur
void Media::setAuteur(string auteur){
    this->auteur=auteur;
}
//Setteur d'une date
void Media::setDate(string date){
    this->date=date;
}
//Setteur d'une durée
void Media::setDuree(int duree){
    this->duree=duree;
}

