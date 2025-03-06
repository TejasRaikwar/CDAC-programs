#include<iostream>
using namespace std;

struct Student {
    char name[50];
    int age;
    char phoneNumber[12];
};

void enterDetails(Student * const sp){
     cout<<"Please Enter Student Details : "<<endl;
     cout<<"Enter Name : ";
     cin>>sp->name;
     cout<<"Enter age : ";
     cin>>sp->age;
     cout<<"Enter you mobile number : ";
     cin>>sp->phoneNumber;

}

void displayDetails(const Student * const sp){
   cout<<"\nDetails of the Student are : "<<endl;
   cout<<"Name : "<<sp->name<<"\tAge : "<<sp->age<<"\tMobile : "<<sp->phoneNumber<<endl<<endl;
}


int main(){
	Student s1;
	enterDetails(&s1);
	displayDetails(&s1);
	return 0;
}
