#include <iostream>
#include <string>
#include "ArbolA.h"
#include "ArbolD.h"

using namespace std;
/*
void Menu();
void Menu()
{
    ArbolA *a1 = new Arbol();
    int Datos [] = {50,30,24,5,28,45,98,52,60};
    int size = *(&Datos + 1) - Datos; 
    for(int i=0;i<size;i++)
    {
        a1->root = a1->insert(Datos[i],a1->root);
    }
    a1->Postorden(a1->root);
}*/

int main()
{
    ArbolA *a1 = new ArbolA();
    ArbolA *a3 = new ArbolA();    
    ArbolA *a2 = new ArbolA();

    string Name [] = {"test","Lab1","Lab2","Lab3","Lab4","Lab5","Taller1","Taller2","Taller3"
    ,"Taller4","Taller5","Taller6","Taller7","Taller8","Taller9","Taller10","Taller11"};
    int size = *(&Name + 1) - Name; 
    for(int i=0;i<size;i++)
    {
        int x = ((i+1)*12);
        a1->root = a1->insert("JJ", (i+1)*4,Name[i],a1->root);
    }

    string Name2 [] = {"test","Lab1","Lab2","Lab3","Lab4","Lab5","Taller1","Taller2","Taller3"};
    int size2 = *(&Name2 + 1) - Name2; 
    for(int i=0;i<size2;i++)
    {
        int x = ((i+1)*12);
        a2->root = a2->insert("Cañon", (i+1)*4,Name2[i],a2->root);
    }

    ArbolD *F1 = new ArbolD();
    string l [] = {"Test","Folder","New folder"};

    F1->root = F1->insert("Universidad", l[1],F1->root, a1);
    F1->root = F1->insert("Juegos", l[2],F1->root, a2);
    F1->root = F1->insert("Videos", l[3],F1->root, a3);
    F1->Postorden(F1->root);
    return 0;
}