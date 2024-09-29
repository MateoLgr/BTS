#include<stdio.h>

int main(){
int B = 2;
int C = 3;
int *P1, *P2;
P1=&B;
P2=&C;
*P1=(*P2)++;
P1=P2;
P2=&B;
*P1-=*P2;
++*P2;
*P1*=*P2;
B=++*P2**P1;
P1=&B;
*P2=*P1/=*P2;
printf("B = %d, C = %d\n",B , C);
printf("P1 = %p, P2 = %p\n",P1 , P2);
return 0;
}
