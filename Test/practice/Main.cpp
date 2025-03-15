#include"employee.h"


int main(){
   int n;
   cout<<"Enter the  number of Employees : ";
   
   Employee *e = new Employee[n];

   for(int i =0; i<n ; i++)
   {
	   cout<<"Enter details : "<<endl;
	   e[i].Accept();
   }
   sortEmp(e, e+n, Employee::sortEmp);

   return 0 ;
}

