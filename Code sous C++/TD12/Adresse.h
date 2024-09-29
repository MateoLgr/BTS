#ifndef ADRESSE_H
#define ADRESSE_H

#include <string>

class Adresse {
private:
    std::string numRue;
    std::string nomRue;
    std::string ville;
    std::string codePostal;

public:
    Adresse(std::string numRue, std::string nomRue, std::string ville, std::string codePostal);
    std::string getAdresseCompletes();
};

#endif
