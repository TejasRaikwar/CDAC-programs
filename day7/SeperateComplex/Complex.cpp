#include<iostream>
#include"Complex.h"
using namespace std;
 
Complex::Complex():real(0),img(0)
{
			 
	cout<<"\n Complex::Complex"<<endl;
}
Complex::Complex(int real,int img):real(real),img(img){
			 
	cout<<"\n Complex::Complex(int,int)"<<endl;
}
void Complex::Accept(){
	cout<<"\n Please Enter real and img number:->"<<endl;
	cin>>real;
	cin>>img;
}
void Complex::Display()const{
	cout<<"\n Complex[" << real<<"+j"<<img<<"]"<<endl;
}
Complex Complex::Add(const Complex temp) const
{
    return Complex(this->real + temp.real, this->img + temp.img);		
}
Complex Complex::operator+ (const Complex temp) const
{
	return Complex(this->real + temp.real,this->img+temp.img);
}
		