#include<bits/stdc++.h>

using namespace std;
void shanthi(int *arr,int n){
	for(int i=0;i<n;i++){
		cout<<2*arr[i]<<" ";
	}
}
int main(){

	int n;
	cout<<"enter size:"<<endl;
	cin>>n;
	int arr[n];
	cout<<"enter array element:"<<endl;
	for(int i=0;i<n;i++){

		cin>>arr[i];
	}

	shanthi(arr,n);
	 return 0;


}
