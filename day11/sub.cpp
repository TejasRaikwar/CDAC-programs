#include <iostream>

using namespace std;

template <class T>

int sub(T &n1, T &n2)
{
    return n1 - n2;
}
int main()
{
    int n1, n2;
    cout << "Enter two number:->" << endl;
    cin >> n1 >> n2;
    int res = sub(n1, n2);
    cout << "Subtraction:->" << res << endl;
    return 0;
}