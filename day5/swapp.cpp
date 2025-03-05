#include<bits/stdc++.h>

using namespace std;
void swapp(int *n1,int *n2){

    int temp = *n1;
    *n1 = *n2;
    *n2 = temp;
}

int main(){
    int n1,n2;

    cout<<"enter two number:->"<<endl;
    cin>>n1>>n2;

    swapp(&n1,&n2);

    cout<<"swapped no."<<n1<<" "<<n2<<endl;
}
