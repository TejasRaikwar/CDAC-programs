#include<iostream>

using namespace std;

void SwapNumber(int &n1,int &n2){
    int temp = n1;
    n1 = n2;
    n2 = temp;
}
int main(){
    int n1,n2;
    cout<<"\n Enter two number for swaping:->"<<endl;
    cin>>n1>>n2;
    SwapNumber(n1,n2);
    cout<<"n1: "<<n1<<" "<<"n2: "<<n2<<endl;
    return 0;
}