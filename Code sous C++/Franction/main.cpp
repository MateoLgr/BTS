#include<iostream>
#include "fraction.h"
using namespace std;

int main(){

Fraction p(3,4);
Fraction t(12,15);
Fraction r=p+t;
Fraction r2=p-t;
Fraction r3=p*t;
Fraction r4=p/t;

int a = r==r2;
int b = r<=r2;
int c = r<r2;
int d = r!=r2;
int e = r>=r2;
int f = r>r2;

cout<<"Le resultat de "<<p.getNum()<<"/"<<p.getDen()<<" + "<<t.getNum()<<"/"<<t.getDen()<<" = "<<r<<endl;
cout<<"Le resultat de "<<p.getNum()<<"/"<<p.getDen()<<" - "<<t.getNum()<<"/"<<t.getDen()<<" = "<<r2<<endl;
cout<<"Le resultat de "<<p.getNum()<<"/"<<p.getDen()<<" * "<<t.getNum()<<"/"<<t.getDen()<<" = "<<r3<<endl;
cout<<"Le resultat de "<<p.getNum()<<"/"<<p.getDen()<<" / "<<t.getNum()<<"/"<<t.getDen()<<" = "<<r4<<endl;

cout<<a<<endl;
cout<<b<<endl;
cout<<c<<endl;
cout<<d<<endl;
cout<<e<<endl;
cout<<f<<endl;

return 0;
}

