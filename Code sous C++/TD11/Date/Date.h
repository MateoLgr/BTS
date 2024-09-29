#ifndef DATE_H
#define DATE_H
#include <string>

class Date{
	private:
	int jour;
	std::string mois;
	int annee;
	public:
	Date(int, std::string, int);
	int getJour();
	std::string getMois();
	int getAnnee();
	void setJour();
	void setMois(std::string);
	void setAnnee();
};
#endif
