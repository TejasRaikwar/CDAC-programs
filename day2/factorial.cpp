#include<iostream>
using namespace std;

double calculateFactorial(int n){
	double prod=1;
	for(int i=n;i>1;i--){
	  prod = prod*i;
	}
	return prod;

}

int main(){
	int n;

	cout<<"Enter value : "<<endl;
	cin>>n;
	cout<<"Factorial Series : ";
	for(int i=1; i<=n ; i++)
	{
	  cout<<calculateFactorial(i)<<" ";
	}
	cout<<endl;
	return 0;
}
