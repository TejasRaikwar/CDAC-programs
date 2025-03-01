#include<iostream>
using namespace std;


int main(){
	int n;
	cout<<"Enter a num : ";
	cin>>n;
	if(n==0)
		cout<<"number is 0"<<endl;
	else if(n%2==0)
		cout<<n<<" is a even number."<<endl;
	else 
		cout<<n<<" is a odd number."<<endl;

	return 0;
}
