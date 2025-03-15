#include <iostream>

using namespace std;

template <class T>

int div1(T &n1, T &n2)
{
    return n1 / n2;
}
int main()
{
    int n1, n2;
    cout << "Enter two number:->" << endl;
    cin >> n1 >> n2;
    float res = div1(n1, n2);
    cout << "Division:->" << res << endl;
    return 0;
}