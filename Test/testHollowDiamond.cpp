#include <iostream>

using namespace std;

int main()
{

    int n = 10;

    // main outer loop
    for (int i = 0; i < n; i++)
    {

        // stars in decreasing order
        for (int j = 0; j < n - i; j++)
        {
            cout << " ";
        }
        // print spaces in increasing order
        for (int j = 0; j < 2 * i; j++)
        {
             cout << "*";
        }
        // print stars in decreasing order
        for (int j = 0; j < n - i; j++){
             cout<<" ";
        }
        cout<<endl;
    }
}