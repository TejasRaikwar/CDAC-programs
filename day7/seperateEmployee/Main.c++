#include "Employee.h"

int main() {
    int n;
    cout << "Enter number of employees:->" << endl;
    cin >> n;

     
    Employee *e = new Employee[n];

     
    for (int i = 0; i < n; i++) {
        cout << "Enter details for employee " << i + 1 << ":->" << endl;
        e[i].Accept();
    }

    
    sort(e, e + n, Employee::compare);

    
    for (int i = 0; i < n; i++) {
        cout << "Details of employee " << i + 1 << ":->" << endl;
        e[i].Display();
    }

   
    delete[] e;

    return 0;
}