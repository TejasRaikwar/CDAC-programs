#include <iostream>
#include "PermEmployee.h"
#include "ContractEmployee.h"

using namespace std;

int main() {
    int a;
    do {
        cout << "Enter Choice:->" << endl;
        cout << "\n1. Permanent Employee";
        cout << "\n2. Contract Employee";
        cout << "\n3. Exit" << endl;
        cin >> a; 

        switch (a) {
            case 1: {
                PermEmployee p;
                Employee *e = &p;
                p.Accept();
                e->CalcSalary();
                p.Display();
                break;
            }
            case 2: {
                ContractEmployee x;
                Employee *y = &x;
                x.Accept();
                y->CalcSalary();
                x.Display();
                break;
            }
            case 3: {
                cout << "Exiting Program..." << endl;
                break;
            }
            default:
                cout << "Invalid choice! Please try again.\n";
                break;
        }
    } while (a != 3);

    return 0;
}