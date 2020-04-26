#include "ArbolA.h"
#include <string>
#include <iostream>

using namespace std;


nodo* ArbolA::insert(string usuario, double size, string archivo, nodo* t)
{
    if(t == NULL)
        {
            t = new nodo;
            t->usuario = usuario;
            t->archivo = archivo;
            t->size = size;
            t->left = t->right = NULL;
            datasize(t->size);
        }
        else if(size < t->size)
        {
            t->left = insert(usuario, size, archivo, t->left);
        }
        else if(size > t->size)
        {
            t->right = insert(usuario, size, archivo, t->right);
        }
        return t;
}

void ArbolA::datasize(double size)
{
    double data = tam + size;
    this->tam = data;
}

void ArbolA::Postorden(nodo* node) 
{ 
    if (node == NULL) 
    {
        return; 
    }

    Postorden(node->left); 
  
    Postorden(node->right); 
    cout <<"|   |-- ["<<node->usuario<<" "<<node->size<<"]     "<<node->archivo<<endl;  
} 