#include <iostream>
#include <string>

using namespace std;

struct node {
        int data;
        node* left;
        node* right;
    };

class Arbol 
{    
    public:

    node* root;

    node* insert(int x, node* t);

    void Postorden(node* t);

};
