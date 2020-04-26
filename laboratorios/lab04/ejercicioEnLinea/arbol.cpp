#include "Arbol.h"
#include <string>
#include <iostream>

using namespace std;

node* Arbol::insert(int x, node* t)
{
    if(t == NULL)
        {
            t = new node;
            t->data = x;
            t->left = t->right = NULL;
        }
        else if(x < t->data)
            t->left = insert(x, t->left);
        else if(x > t->data)
            t->right = insert(x, t->right);
        return t;
}

void Arbol::Postorden(node* node) 
{ 
    if (node == NULL) 
    {
        return; 
    }

    Postorden(node->left); 
  
    Postorden(node->right); 
  
    cout << node->data <<endl; 
} 
