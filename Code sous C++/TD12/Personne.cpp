#include "Personne.h"

Personne::Personne(std::string nom, std::string prenom, Adresse adresse)
    : nom(nom), prenom(prenom), adresse(adresse) {}

std::string Personne::getNomComplet() {
    return prenom + " " + nom;
}
