#include <iostream>
#include <string>
#include "Arbol.h"

using namespace std;

void Menu();

void Menu()
{
    Arbol *a1 = new Arbol();
    int Datos [] = {50,30,24,5,28,45,98,52,60};
    int size = *(&Datos + 1) - Datos; 
    for(int i=0;i<size;i++)
    {
        a1->root = a1->insert(Datos[i],a1->root);
    }

    a1->Postorden(a1->root);
}

int main()
{
    Menu();
    return 0;
}
