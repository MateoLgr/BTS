#include "Etudiant.h"

Etudiant::Etudiant(std::string nom, std::string prenom, Adresse adresse, std::string filiere)
    : Personne(nom, prenom, adresse), filiere(filiere) {}

std::string Etudiant::getFiliere() {
    return filiere;
}
