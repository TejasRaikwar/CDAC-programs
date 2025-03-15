//Create MobilePhone class with serialNo, modelNo, brandName and price.
#include<iostream>
#include<string>
using namespace std;
class MobilePhone{
	public:
		string serialNo;
		string modelNo;
		string brandName;
		double price;
	        
	        MobilePhone(){}
	        MobilePhone(string serialNo , string modelNo , string brandName, double price): serialNo(serialNo),modelNo(modelNo),brandName(brandName) ,price(price) 
	        {}
		void Accept(){
			cout<<"Enter Mobile Phone Details : "<<endl;
			cout<<"Enter Serial No : ";
			cin>>serialNo;
			cout<<"Enter Model No : ";
			cin>>modelNo;
			cout<<"Enter Brand Name : ";
			cin>>brandName;
			cout<<"Enter Price : ";
			cin>>price;
		}
		void Display(){
			cout<<"Mobile Phone Details : "<<endl;
			cout<<"[ Serial No : "<<serialNo<<endl;
			cout<<"Model No : "<<modelNo<<endl;
			cout<<"Brand Name : "<<brandName<<endl;
			cout<<"Price : "<<price<<" ]"<<endl;
		}


};
