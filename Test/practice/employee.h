#include<iostream>
#include<string.h>


using namespace std;

class Employee{
   int empId;
   string name;
   double salary;

	public :
   void Accept();
   void Display();
   static bool sortEmp(const employee &e1,const employee &e2);
    

};
