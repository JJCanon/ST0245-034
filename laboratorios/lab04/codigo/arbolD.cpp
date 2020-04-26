#include "ArbolD.h"
#include <string>
#include <iostream>

using namespace std;

nodoD* ArbolD::insert(string name, string folder, nodoD* t, ArbolA *a)
{

    if(t == NULL)
        {
            t = new nodoD;
            t->size = a->tam;
            t->name = name;
            t->folder = folder;
            t->a = a;
            t->left = NULL;
            t->right = NULL;
        }
        else if(t->size < a->tam)
            t->left = insert(name, folder, t->left, a);
        else if(t->size > a->tam)
            t->right = insert(name, folder, t->right, a);
        return t;

}

void ArbolD::Postorden(nodoD* nodo) 
{ 
    if (nodo == NULL) 
    {
        return; 
    }

    Postorden(nodo->left); 
  
    Postorden(nodo->right); 
  
    cout <<"|-- ["<<nodo->name<<" "<<nodo->size<<"]     "<<nodo->folder<<endl;
    nodo->a->Postorden(nodo->a->root);
} 
