#ifndef MEDIA_H
#define MEDIA_H

#include <iostream>

//Header de la classe Media
class Media{
    private :
        std::string titre;
        std::string auteur;
        std::string date;
        int duree;
    public :
        Media(std::string, std::string, std::string, int);
        std::string getTitre();
        std::string getAuteur();
        std::string getDate();
        int getDuree();
        void setTitre(std::string);
        void setAuteur(std::string);
        void setDate(std::string);
        void setDuree(int);
        Media();
};

#endif // MEDIA_H
