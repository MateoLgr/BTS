#ifndef LIVRE_H
#define LIVRE_H
#include "media.h"
#include <iostream>

//Header de la classe Livre
class Livre: public Media{
    private :
        int nmbrPage;
        std::string editeur;
     public :
        Livre(std::string titre, std::string auteur, std::string date, int duree, int nmbrPage, std::string editeur);
        int getNmbrPage();
        std::string getEditeur();
};

#endif // LIVRE_H
