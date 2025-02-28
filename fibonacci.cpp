#include<iostream>
using namespace std ;
 

int main(){
	int num,a=0,b=1,c;
	cout<<"how many number do you want : "<<endl;
	cin>>num;

	for(int i=0 ;i<=num ; i++ ){
		cout<<a<<" ";
		c = a + b;
		a=b;
		b=c;

	}
	cout<<endl;
	return 0;
}
