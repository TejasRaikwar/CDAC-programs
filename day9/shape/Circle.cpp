#include "Circle.h"

void Circle::Accept(){
    cout<<"\n Enter radius"<<endl;
    cin>>raduis;
}

float Circle::calcArea(){
    float area = 3.14*raduis*raduis;
    return area;
}

float Circle::calcPeri(){
    float peri = 2*3.14*raduis;
    return peri;
}