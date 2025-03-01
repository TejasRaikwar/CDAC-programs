#include<iostream>
#include<math.h>
using namespace std;

int main(){
	int num,p;
	cout<<"Enter number and its power : ";
	cin>>num>>p;
	double res = pow(num,p);
	cout<<res<<endl;
	return 0;
}
