#include<bits/stdc++.h>

using namespace std;


int main(){

	int n;
	cout<<"enter no.:->"<<endl;
	cin>>n;
	string s = "";
	cout<<"enter a character";
	for(int i=0;i<n;i++){
		char c;
		cin>>c;
		s+=c;
	}
	cout<<"your string:->"<<s<<endl;
	return 0;
}
