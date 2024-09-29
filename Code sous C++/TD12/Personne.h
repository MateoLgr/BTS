#ifndef PERSONNE_H
#define PERSONNE_H

#include <string>
#include "Adresse.h"

class Personne {
private:
    std::string nom;
    std::string prenom;
    Adresse adresse;

public:
    Personne(std::string nom, std::string prenom, Adresse adresse);
    std::string getNomComplet();
};

#endif
