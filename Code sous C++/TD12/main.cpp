#include <iostream>
#include "Personne.h"
#include "Adresse.h"
#include "Etudiant.h"
#include "Prof.h"

int main() {
    Adresse adr("1", "Rue de la Paix", "Paris", "75001");
    Personne p1("Dupont", "Jean", adr);
    std::cout << "Nom complet de la personne : " << p1.getNomComplet() << std::endl;
    std::cout << "Adresse de la personne :\n" << adr.getAdresseCompletes() << std::endl;

    Prof p2("Dupont", "Jean", adr, "Mathematique");
    std::cout << "Nom complet du prof : " << p2.getNomComplet() << std::endl;
    std::cout << "Matiere enseignee : " << p2.getMatiere() << std::endl;

    Etudiant e1("Martin", "Lucie", adr, "Informatique");
    std::cout << "Nom complet de l'etudiant : " << e1.getNomComplet() << std::endl;
    std::cout << "Filiere de l'etudiant : " << e1.getFiliere() << std::endl;

    return 0;
}
