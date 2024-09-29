#ifndef DIGITALVERSATILEDISK_H
#define DIGITALVERSATILEDISK_H
#include "media.h"
#include <iostream>

//Header de la classe DVD
class DigitalVersatileDisk: public Media{
    private:
        int taille;
    public :
        DigitalVersatileDisk(std::string titre, std::string auteur, std::string date,int duree, int taille);
        int getTaille();
        void setTaille(int);
};



#endif // DIGITALVERSATILEDISK_H
