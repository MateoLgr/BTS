#include <iostream>
#ifndef RECTANGLE_H
#define RECTANGLE_H

class Rectangle {
private :
float longueur;
float largeur;
float X;
float Y;
int cpt;
public :
friend std::ostream&operator <<(std::ostream&,const Rectangle&);
float getX() const;
float getY() const;
float getLongueur() const;
float getLargeur() const;
Rectangle(float Longueur, float Largeur, float Y, float X);
bool operator == (const Rectangle&);
bool operator != (const Rectangle&);
bool operator < (const Rectangle&);
bool operator > (const Rectangle&);
int getCpt();
~Rectangle();
};
#endif
