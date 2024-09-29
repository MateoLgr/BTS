#include <string>

class Moteur{
	private :
	std::string typeMoteur;
	int puissance;
	public :
	Moteur(std::string monmot, int pui){
	typeMoteur=monmot;
	puissance=pui;
	};
	afficherDetails(){
	cout << typeMoteur<<endl;
	cout << puissance << endl;
	}
	std::string getTypeMoteur(){
	return monmot;
	}
	int getPuissance(){
	return pui;
	}
	void setTypeMoteur(string typeMoteur){
	this -> monmot = monmot;
	void setPuissance(int puissance){
	this -> pui = pui;
	}

int main{
	Moteur m("Essence",1200);
	m.afficheDetail();
	return 0;
	}
	
	
