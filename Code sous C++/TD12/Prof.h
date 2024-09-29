#ifndef PROF_H
#define PROF_H

#include <string>
#include "Personne.h"

class Prof : public Personne {
private:
    std::string matiere;

public:
    Prof(std::string nom, std::string prenom, Adresse adresse, std::string matiere);
    std::string getMatiere();
};

#endif
