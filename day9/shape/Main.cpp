#include "Rect.h"
#include "Circle.h"
int main(){
    Shape *s = nullptr;
    Rect r;
    Circle c;
    s=&c;
    s->Accept();
    float a = s->calcArea();
    cout<<"Area of circle:->"<<a<<endl;
    float b = s->calcPeri();
    cout<<"Perimeter of Circle:->"<<b<<endl;


    s=&r;
    s->Accept();
    float d = s->calcArea();
    cout<<"Area of rectangle:->"<<d<<endl;

    float e = s->calcPeri();
    cout<<"perimeter of rectangle:->"<<e<<endl;



}
