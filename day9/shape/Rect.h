#ifndef RECT_H
#define RECT_H
#include "shape.h"
class Rect:public Shape{
    private:
        int length;
        int breadth;
    public:
        void Display();
        void Accept();
        float calcArea();
        float calcPeri();
};
#endif