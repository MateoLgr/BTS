#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int alea(int maxRand)
{

    return rand() %(maxRand+1);
}


int main () {

    srand(time(NULL));

    int alea = rand() %(10+1);

    int guess;

    printf ("Choose a number between 0 and 10 : ");

    scanf ("%d", & guess);

    while (guess != alea){
    
        printf ("Too bad, try again !");
}

    while (guess != alea, guess == alea);

    if (guess == alea) {

        printf ("You win !");

}

    else {

        printf ("You loose !");

}
}
