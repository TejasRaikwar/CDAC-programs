#include<iostream>
using namespace std;
int main(){
   int a,b,temp;
   cout<<"Enter number for A : ";
   cin>>a;
   cout<<"Enter number for B : ";
   cin>>b;

   temp = a;
   a=b;
   b=temp;

   cout<<"A : "<<a<<endl;
   cout<<"B : "<<b<<endl;

   return 0;


}
