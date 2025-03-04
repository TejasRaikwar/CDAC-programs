#include<bits/stdc++.h>

using namespace std;

void bubbleSort(int *a,int *n){

	for(int i=0;i<*n;i++){
		bool flg = false;
		for(int j=0;j<*n-i-1;j++){
		   
			if(a[j]>a[j+1]){
				int temp = a[j];
		   		a[j] = a[j+1];
		   		a[j+1] = temp;
				flg = true;
			}
		}
		if(!flg){
			break;
		}
	}
	
}
int main(){
	int n;
	cout<<"enter size:->"<<endl;
	cin>>n;
	int arr[n];

	cout<<"enter elements:->"<<endl;

	for(int i=0;i<n;i++){
		cin>>arr[i];
	}

    	bubbleSort(arr,&n);
	
	cout<<"sorted Array:->"<<endl;

	for(int i=0;i<n;i++){
		cout<<" "<<arr[i];
	}
	
	return 0;
}
