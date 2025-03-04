#include<iostream>
using namespace std;

void pypart2(int n)
{ 
   
    int i, j,k=n;

    for (i = 1; i <= n; i++) {
        for (j = 1; j <= n; j++) {
            if (j >= k)
                cout << "* ";
            else
                cout << " ";
        }
        k--;
        cout << "\n";
    }
}

int main()
{
	int n;
    cout<<"How many rows : ";
    cin>>n;
    pypart2(n);
    return 0;
}
   
