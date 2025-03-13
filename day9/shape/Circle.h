#ifndef CIRCLE_H
#define CIRCLE_H
#include "shape.h"
class Circle:public Shape{
    private:
        int raduis;
    public:
        void Accept();
        float calcArea();
        float calcPeri();
};
#endif