#include "Rectangle.h"
#include<iostream>
using namespace std;

int cpt=0;
Rectangle::Rectangle (float a, float b, float c, float d){
	longueur = a;
	largeur = b;
	X = c;
	Y = d;
	cpt++;
}

Rectangle::~Rectangle(){
	cpt--;
}

int Rectangle::getCpt(){
return cpt;
}

float Rectangle::getLongueur() const{
	return longueur;
}

float Rectangle::getLargeur() const{
	return largeur;
}

float Rectangle::getX() const{
	return X;
}

float Rectangle::getY() const{
	return Y;
}

ostream & operator<<(ostream& os, const Rectangle& r){
	return os<<"l:"<<r.getLongueur() <<"L:"<<r.getLargeur() <<"x:"<<r.getX() <<"y:"<<r.getY();
}

bool Rectangle::operator==(const Rectangle& r){
	return ((longueur==r.getLongueur()) && (largeur==r.getLargeur())) || ((longueur==r.getLargeur()) && (largeur==r.getLongueur()));
}

bool Rectangle::operator != (const Rectangle& r){
	return ! this->operator == (r);
}

bool Rectangle::operator < (const Rectangle& r){
	return largeur*longueur < r.getLargeur()*r.getLongueur();
}

bool Rectangle::operator > (const Rectangle& r){
	return largeur*longueur > r.getLargeur()*r.getLongueur();
}


