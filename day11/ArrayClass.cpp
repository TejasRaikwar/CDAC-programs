#include <iostream>

using namespace std;
template <class T>
class ArrayClass
{
private:
    T *arr;
    int size;

public:
    ArrayClass(int s)
    {
        size = s;
        arr = new T[size];
    }
    ~ArrayClass()
    {
        delete[] arr;
    }
    void Accept()
    {
        cout << "Enter Array element:->" << endl;
        for (int i = 0; i < size; i++)
        {
            cin >> arr[i];
        }
    }
    void Dispaly()
    {
        cout << "Array elements:->" << endl;
        for (int i = 0; i < size; i++)
        {
            cout << " " << arr[i];
        }
    }
};

int main()
{

    int choice;
    do
    {
        cout << "\n============-: Enter your choice :-============\n";
        cout << "\n 1.Integer ";
        cout << " \n 2.Float ";
        cout << "\n 3.Character";
        cout << "\n 4.String";
        cout << "\n 5.Exit ";
        cin >> choice;    cout << "enter array size:->
        switch (choice)
        {
        case 1:
        {
            int n;
            cout << "enter array size:->";
            cin >> n;

            ArrayClass<int> intArr(n);
            intArr.Accept();
            intArr.Dispaly();
            break;
        }
        case 2:
        {
            int n;
            cout << "enter array size:->";
            cin >> n;

            ArrayClass<float> intArr(n);
            intArr.Accept();
            intArr.Dispaly();
            break;
        }
        case 3:
        {
            int n;
            cout << "enter array size:->";
            cin >> n;

            ArrayClass<char> intArr(n);
            intArr.Accept();
            intArr.Dispaly();
            break;
        }
        case 4:
        {
            int n;
            cout << "enter array size:->";
            cin >> n;

            ArrayClass<string> intArr(n);
            intArr.Accept();
            intArr.Dispaly();
        }
        case 5:
        {
            cout << "Exit Program..";
            break;
        }
        default:
        {
            "Invalid Choice..";
            break;
        }
        }

    } while (choice != 5);
    return 0;
}
