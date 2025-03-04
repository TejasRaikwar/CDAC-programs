#include <iostream>
using namespace std;

int main() {
    
    int n;// = 5; // Number of rows for the upper half of the pattern
    cout<<"how many rows(tell the half only) : ";
    cin>>n;

    // Upper half of the pattern
    for (int i = 0; i < n; i++) {
        // Print stars in decreasing order
        for (int j = 0; j < n - i; j++) {
            cout << "*";
        }
        // Print spaces in increasing order
        for (int j = 0; j < 2 * i; j++) {
            cout << " ";
        }
        // Print stars in decreasing order
        for (int j = 0; j < n - i; j++) {
            cout << "*";
        }
        cout << endl;
    }

    // Lower half of the pattern
    for (int i = n - 2; i >= 0; i--) {
        // Print stars in increasing order
        for (int j = 0; j < n - i; j++) {
            cout << "*";
        }
        // Print spaces in decreasing order
        for (int j = 0; j < 2 * i; j++) {
            cout << " ";
        }
        // Print stars in increasing order
        for (int j = 0; j < n - i; j++) {
            cout << "*";
        }
        cout << endl;
    }

    return 0;
}
