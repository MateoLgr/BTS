#include <iostream>
#include "Rectangle.h"
using namespace std;

int main(){
	Rectangle i(4, 7, 5, 8);
	Rectangle j(4, 7, 5, 8);
	
	int a=i==j;
	cout<<a;
	return 0;
}
