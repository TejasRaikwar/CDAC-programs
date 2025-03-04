#include<bits/stdc++.h>

using namespace std;

void reverse(char *s,int i,int n)
{
	if(i == n){
		return;
   	}
	char temp = s[i]; 
	reverse(s, i+1, n);
 	cout << temp;
}
int main(){
	int n;
	cout<<"enter size of char string:->"<<endl;
	cin>>n;
        char a[n];

        cout<<"enter a string:->"<<endl;
	for(int i=0;i<n;i++){
		cin>>a[i];
	}
    	reverse(a, 0, n);
	return 0;
}
