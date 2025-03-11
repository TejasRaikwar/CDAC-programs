#include<bits/stdc++.h>

using namespace std;
class Array{
    private:
        int *arr;
        int size;

    public:
        Array(int size){
            this->size = size;
            arr = new int[size];
        }
        ~Array(){
            delete[] arr;
        }
        void Accept(){
            cout<<"Enter Array element:->"<<endl;
            for(int i=0;i<size;i++){
                cin>>arr[i];
            }
        }
        void Display(){
            cout<<"Array element:->"<<endl;
            for(int i=0;i<size;i++){
                cout<<arr[i]<<" ";
            }
        }
};
int main(){
    int n;
    cout<<"Enter array element:->"<<endl;
    cin>>n;

    Array a(n);

    a.Accept();
    a.Display();

    return 0;
}