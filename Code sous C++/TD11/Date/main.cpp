#include <string>
#include "Date.h"
using namespace std;

int main(){

	Date d();
	d.setJour("8");
	d.setMois("mai");
	d.setAnnee("1945");
	cout<<"On est le"<<d.getJour()<<d.getMois()<<d.getAnnee();
}
