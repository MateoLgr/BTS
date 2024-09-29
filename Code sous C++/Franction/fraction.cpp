#include <iostream>
#include "fraction.h"
using namespace std;

int Fraction::pgcd(int a, int b){
	int r = 0;
	
	while(b != 0){
	r=a%b;
	a=b;
	b=r;
	
	
	}
	return a;
}

void Fraction::simplifier(){
	int g = pgcd(num,den);
	num=num/g;
	den=den/g;
}

Fraction::Fraction(int a, int b){
	num=a;
	den=b;
	this->simplifier();
}

void Fraction::afficher(){
	cout<<num<<"/"<<den<<"\n";
}

int Fraction::getNum() const{
	return num;
}

int Fraction::getDen() const{
	return den;
}



Fraction Fraction::operator +(const Fraction& f){
	return Fraction(num*f.getDen()+den*f.getNum(), den*f.getDen());
}

Fraction Fraction::operator +(const int a){
	return Fraction(num+a*den, den);
}

Fraction Fraction::operator -(const Fraction& f){
	return Fraction(num*f.getDen()-den*f.getNum(), den*f.getDen());
}

Fraction Fraction::operator -(const int a){
	return Fraction(num-a*den, den);
}

Fraction Fraction::operator *(const Fraction& f){
	return Fraction(num*f.getNum(), den*f.getDen());
}

Fraction Fraction::operator *(const int a){
	return Fraction(num*a, den);
}

Fraction Fraction::operator /(const Fraction& f){
	return Fraction(num*f.getDen(), den*f.getNum());
}

Fraction Fraction::operator /(const int a){
	return Fraction(num, den*a);
}

bool Fraction::operator ==(const Fraction& f){
	return (num==f.getNum()) && (den==f.getDen());
}

bool Fraction::operator !=(const Fraction& f){
	return (num!=f.getNum()) || (den!=f.getDen());
}

bool Fraction::operator <=(const Fraction& f){
	return (num<=f.getNum()) && (den<=f.getDen());
}

bool Fraction::operator <(const Fraction& f){
	return (num<f.getNum()) && (den<f.getDen());
}

bool Fraction::operator >=(const Fraction& f){
	return (num>=f.getNum()) && (den>=f.getDen());
}

bool Fraction::operator >(const Fraction& f){
	return (num>f.getNum()) && (den>f.getDen());
}


ostream& operator<<(ostream& os, const Fraction& f){
	return os<<f.getNum() <<"/"<<f.getDen();
}

