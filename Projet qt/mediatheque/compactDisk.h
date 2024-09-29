#ifndef COMPACTDISK_H
#define COMPACTDISK_H
#include "media.h"
#include <iostream>

//Header de la classe CD
class CompactDisk: public Media{
    private :
    int taille;
    public :
    CompactDisk(std::string titre, std::string auteur, std::string date,int duree, int taille);
    int getTaille();
    void setTaille(int);
};

#endif // COMPACTDISK_H
