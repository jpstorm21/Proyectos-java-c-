/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: Usuario
 *
 * Created on 4 de octubre de 2017, 23:18
 */

#include <cstdlib>
#include <iostream>
#include "Mascota.h"
#include "gato.h"
using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    Mascota *M =  new gato("siames","luna");
    cout<<M->getNombre();
    
    
    return 0;
}

