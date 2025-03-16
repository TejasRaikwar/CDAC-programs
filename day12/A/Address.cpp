#include<iostream>
#include<string.h>
using namespace std;


class Address{
    private :
       string area, city;
       int pincode;
    public : 
        Address(){};
        Address(string area, string city, int pincode):area(area), city(city), pincode(pincode){};
        void Accept(){
            cout<<"area : ";cin>>area;
            cout<<"city : "; cin>>city;
            cout<<"pincode : ";cin>>pincode;
        }

        void Display() const{
            cout<<area<<", "<<city<<" - "<<pincode<<endl;
        }

};