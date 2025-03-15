#include "employee.h"

int main()
{
   int n;
   cout << "Enter the  number of Employees : ";
   cin>>n;
   Employee *e = new Employee[n];

   for (int i = 0; i < n; i++)
   {
      e[i].Accept();
   }
   sort(e, e + n, Employee::sortEmp);
   for (int i = 0; i < n; i++)
   {
      e[i].Display();
   }

   return 0;
}
