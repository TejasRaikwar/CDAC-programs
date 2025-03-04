#include<bits/stdc++.h>

using namespace std;

int main(){
	
	int n;
	cout<<"enter a size:->"<<endl;
	cin>>n;
	int arr[n];	
        cout<<"enter element:->"<<endl;
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	int min = INT_MAX;
	int max = INT_MIN;

	for(int i=0;i<n;i++){
		if(arr[i]<min){
			min = arr[i];
		}
		if(arr[i]>max){
			max = arr[i];
		}
	}
	int sMin = INT_MAX;
	int sMax = INT_MIN;
	for(int i=0;i<n;i++){
	
		if(arr[i] != min && arr[i]<sMin){
			sMin = arr[i];
		}

		if(arr[i] != max && arr[i]>sMax){
			sMax = arr[i];
		}
	}

	cout<<"mini value"<<" "<<min<<endl;
	cout<<"max value"<<" "<<max<<endl;

	cout<<"second min value"<<" "<<sMin<<endl;
	cout<<"second max value"<<" "<<sMax<<endl;
	return 0;

}
