#pragma once
#include <iostream>
#include <string>

using namespace std;

struct nodo
{
    string usuario;
    double size;
    string archivo;

    nodo* left;
    nodo* right;

};

class ArbolA 
{    
    public:

    void datasize(double size);

    nodo* root;

    nodo* insert(string usuario, double size, string archivo, nodo* t);

    void Postorden(nodo* t);

    int tam;

};