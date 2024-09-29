#include "Adresse.h"

Adresse::Adresse(std::string numRue, std::string nomRue, std::string ville, std::string codePostal)
    : numRue(numRue), nomRue(nomRue), ville(ville), codePostal(codePostal) {}

std::string Adresse::getAdresseCompletes() {
    return numRue + " " + nomRue + "\n" + codePostal + " " + ville;
}
