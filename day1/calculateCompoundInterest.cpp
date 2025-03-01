#include<iostream>
#include<math.h>
using namespace std;

int main(){
	int principalAmount, rate, time;
        cout<<"Enter Amount : ";
	cin>>principalAmount;
	cout<<"Enter rate: ";
	cin>>rate;
	cout<<"Enter time : ";
	cin>>time;
	
	double A = principalAmount * ((pow((1 +(double) rate / 100), time)));
	double CI = A - principalAmount;

	cout<<"CI : "<<CI<<endl;
	return 0;

}
