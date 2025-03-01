#include<bits/stdc++.h>

using namespace std;

int main(){
	int a;
	int sum =0;

	cout<<"Enter any four digit number : "<<endl ;
	cin>>a ;

	while(a!=0){
	  int dig = a%10;
	  sum+=dig;
	  a = a/10;
	}

	cout<<"Sum = "<<sum<<endl;
	return 0;
}
