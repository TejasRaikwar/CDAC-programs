#include<iostream>
#include "Complex.h"
using namespace std;

 
int main(){
	Complex c1(10, 10), c2(20, 20), c4(5,5), c5(30, 30);
	Complex c3;
	c3 = c1.Add(c2).Add(c4).Add(c5);
	c3 = c1 + c2 + c4 +c5;
	c3.Display();
	return 0;
}