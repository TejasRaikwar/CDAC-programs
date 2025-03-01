#include<iostream>
using namespace std;

int main(){
      char letter;
      cout<<"Enter a letter : ";
      cin>>letter;
      cout<<"\n";
      if(letter>='a' && letter<='z')
      {
	      cout<<letter<<" is small letter";
      }
      else if(letter>='A' && letter<='Z'){
           cout<<letter<<" is capital letter";
      }
      else{
         cout<<letter<<" is not an alphabet";
      }

      cout<<"\n\n";
	return 0;
}
