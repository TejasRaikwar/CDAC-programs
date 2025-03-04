#include<iostream>
using namespace std;


int main(){
	int n;
	cout<<"how many rows : ";
	cin>>n;
	for(int i=0; i<=n ; i++ ){
		for(int j=0; j<=n ; j++){
                   if(j<=i){
			   cout<<"  " ;
			   continue;
		   }
		   cout<<"* ";
	   }
	   cout<<endl;
	
	}
return 0;


}
