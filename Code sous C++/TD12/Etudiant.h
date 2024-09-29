#ifndef ETUDIANT_H
#define ETUDIANT_H

#include <string>
#include "Personne.h"

class Etudiant : public Personne {
private:
    std::string filiere;

public:
    Etudiant(std::string nom, std::string prenom, Adresse adresse, std::string filiere);
    std::string getFiliere();
};

#endif
