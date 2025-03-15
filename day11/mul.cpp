#include <iostream>

using namespace std;

template <class T>

int mul(T &n1, T &n2)
{
    return n1 * n2;
}
int main()
{
    int n1, n2;
    cout << "Enter two number:->" << endl;
    cin >> n1 >> n2;
    int res = mul(n1, n2);
    cout << "Multification:->" << res << endl;
    return 0;
}