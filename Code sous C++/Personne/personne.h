#ifndef PERSONNE_H
#define PERSONNE_H
#include <string>

class Personne{
	private : 
	std::string nom;
	int age;
	public :
	Personne(std::string, int);
	std::string getNom();
	int getAge();
	void setNom(std::string);
	void setAge(int);
	void feteAnniv();
	Personne();
};
#endif
