#include<bits/stdc++.h>

using namespace std;

int main(){

	int n;
	cout<<"enter a number"<<endl;
	cin>>n;
	int arr[n];
	int sum = 0;
	cout<<"enter array element"<<endl;
	for(int i=0;i<n;i++){
		cin>>arr[i];
		sum += arr[i];
	}

	float res =(float)sum/n;

	cout<<"average :->"<<res<<endl;

	return 0;
}
