#include<bits/stdc++.h>

using namespace std;

int factorial(int n){
	if(n>1){
		return n * factorial(n-1);
	}else{
		return 1;
	}
}
int main(){
	int n;
	cout<<"enter a number:->"<<endl;
	cin>>n;
	int res = factorial(n);

	cout<<"factorial of number:->"<<res<<endl;	
	return 0;
}
