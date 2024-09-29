#ifndef FRACTION_H
#define FRACTION_H
#include <iostream>

class Fraction{

private:

int num;
int den;

void simplifier();

public:

Fraction(int, int);
int pgcd(int, int);
void afficher();
friend std::ostream& operator<<(std::ostream&, const Fraction&);
Fraction operator +(const Fraction&);
Fraction operator *(const Fraction&);
Fraction operator /(const Fraction&);
Fraction operator -(const Fraction&);

Fraction operator +(const int);
Fraction operator *(const int);
Fraction operator /(const int);
Fraction operator -(const int);

bool operator ==(const Fraction&);
bool operator !=(const Fraction&);
bool operator <=(const Fraction&);
bool operator <(const Fraction&);
bool operator >=(const Fraction&);
bool operator >(const Fraction&);

int getNum() const;
int getDen() const;

};
#endif
