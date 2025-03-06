#include<bits/stdc++.h>
 using namespace std;

class Student{
   private:
	 string name;
	 int age;
	 int rollNo;
   public:
	 Student(){ 
	   cout<<"object created";
	 }

	 Student(int rollNo, string name, int age){
	        this->rollNo = rollNo;
		this->age = age;
		this->name = name;
	 }

	  void display(){
  		cout<<"Roll No. : "<<rollNo<<"Name : "<<name<<"Age : "<<age<<endl;
	  }
};


int main(){
	Student s1(1,"Tejas",24);
	s1.display();


	return 0;

}
