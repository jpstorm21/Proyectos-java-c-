/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Nodo.cpp
 * Author: Usuario
 * 
 * Created on 27 de julio de 2017, 21:04
 */

#include "Nodo.h"
#include <cstdlib>
Nodo::Nodo() {
}

Nodo::Nodo(int dato) {
    this->dato= dato;
    this->next = NULL;
}

int Nodo::getDato() {
    return this->dato;
}

Nodo* Nodo::getNext() {
    return this->next;
}

void Nodo::setNext(Nodo* next) {
    this->next= next;
}

Nodo::~Nodo() {
}

