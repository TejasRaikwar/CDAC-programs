#include<bits/stdc++.h>

using namespace std;

void studentData(string arr){
	int n = arr.size();

	cout<<"student name:->"<<endl;

	for(int i=0;i<n;i++){
		cout<<arr[i]<<endl;
	}
}
int main(){
	int n;
	cout<<"enter no. of student"<<endl;
	cin>>n;

	string arr[n];
 	
	cout<<"enter student name:->"<<endl;

	for(int i=0;i<n;i++){
		cin>>arr[i];
	}

	studentData(arr);
	return 0;
}
