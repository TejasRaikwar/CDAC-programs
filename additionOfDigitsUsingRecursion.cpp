#include<bits/stdc++.h>

using namespace std;

int addDigits(int a){
	if(a==0)
	   return 0;
	return (a%10 + addDigits(a/10));
}


int main(){
	int a;
	cout<<"Enter 4 digit number : "<<endl;
	cin>>a;
	cout<<"Addition : "<<addDigits(a)<<endl;
	return 0;
}
