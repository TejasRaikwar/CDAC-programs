#include <iostream>
#include "Rect.h"

void Rect::Accept(){
    cout<<"\n Enter Rectangle length and breadth:->"<<endl;
    cin>>length>>breadth;
}

void Rect::Display(){
    cout<<"Rectangle lenght:->"<<length<<endl;
    cout<<"Rectangle breadth:->"<<breadth<<endl;
}

float Rect::calcArea(){
    float area  = length*breadth;
    return area;
}

float Rect::calcPeri(){
    float peri = 2* (breadth+length);
    return peri;
}