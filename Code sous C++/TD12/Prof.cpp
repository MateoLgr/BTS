#include "Prof.h"

Prof::Prof(std::string nom, std::string prenom, Adresse adresse, std::string matiere)
    : Personne(nom, prenom, adresse) {
		
		
		this->matiere=matiere;
	}

std::string Prof::getMatiere() {
    return matiere;
}

