#include<iostream>

using namespace std;
class Complex{
    private:
        int real;
        int img;
    
    public:
        Complex():real(0), img(0){
            cout<<"Complex::Complex"<<endl;
        }
        Complex(int real,int img):real(real),img(img){
            cout<<"Complex:Complex(int,int)"<<endl;
        }
        void Accept(){
            cout<<"Enter real"<<endl;
            cin>>real;
            cout<<"Enter img"<<endl;
            cin>>img;
        }
        void Display(){
            cout<<"\n Complex [ "<<real<<" +j"<<img<<" ]"<<endl;
        }

        void Display1(){
            cout<<"\n Complex [ "<<real<<" -j"<<img<<" ]"<<endl;
        }
        void Display2(){
            cout<<"\n Complex [ "<<real<<" *j"<<img<<" ]"<<endl;
        }

        Complex operator+ (Complex temp){
            return Complex(this->real + temp.real,this->img + temp.img);
        }
        Complex operator- (Complex temp){
            return Complex(this->real - temp.real,this->img - temp.img);
        }
        Complex operator* (Complex temp){
            return Complex(this->real * temp.real,this->img * temp.img);
        }
         
};
int main(){

    Complex c1(20,40);
    Complex c2(10,20);
    Complex c3;
    
    c3 = c1 + c2;
    c3.Display();

    Complex c4(30,50);
    Complex c5(10,20);
    Complex c6;
    c6 = c4 - c5;
    c6.Display1();

    Complex c7(20,40);
    Complex c8(10,20);
    Complex c9;
    
    c9 = c7 * c8;
    c9.Display2();
    return 0;
}