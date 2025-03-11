#include<iostream>

using namespace std;
int fact(const int &n){
    if(n==0 || n == 1){
        return 1;
    }
    //n = n -1; this line give error
    return n * fact(n-1);
}
int main(){
    int n;
    cout<<"Enter number:->";
    cin>>n;
    int res = fact(n);
    cout<<"Factorial:->"<<res<<endl;
    return 0; 
}