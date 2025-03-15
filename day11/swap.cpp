#include <iostream>

using namespace std;
template <class T>
// function template
void Swap1(T &n1, T &n2)
{
    T temp = n1;
    n1 = n2;
    n2 = temp;
}
// class template
// template <class T>
// class Swap3
// {
// public:
//     T Swap2(T n1, T n2)
//     {
//         T temp = n1;
//         n2 = n2;
//         n2 = temp;
//     }
// };
int main()
{

    int n1 = 10, n2 = 20;
    Swap1(n1, n2);
    cout << n1 << " " << n2;

    // using class

    // Swap3<int> s;

    // cout << s.Swap2(n1, n2);

    // float
    //  int n1 = 10.10, n2 = 20.10;
    //  Swap(n1, n2);
    //  cout << n1 << " " << n2;
    return 0;
}