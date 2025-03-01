#include<iostream>
using namespace std;

void circle(){
	double r;
	cout<<"\n\nEnter radius of a circle : "<<endl;
	cin>>r;
	cout<<"Area of cicle : "<< (3.142*r*r);
}

void rectangle(){
	double l, b;
	cout<<"\n\nEnter length of rectangle : ";
	cin>>l;
	cout<<"Enter breath of rectangle : ";
	cin>>b;
	cout<<"Area of rectangle :"<< (l*b);
}

void square(){
     double s;
     cout<<"\n\nEnter size of square : ";
     cin>>s;
     cout<<"Area of square : "<< s*s;
}




int main(){

	int opt;
	cout<<"\n\nchoose an option from below to calculate area, \n 1. Circle \n 2. Rectandle \n 3. Square \n 0. To Exit"<<endl;
	cout<<"Enter your choice : ";
	cin>>opt;
	switch(opt){
		case 1:
			circle();
			break;
		case 2:
			rectangle();
			break;
		case 3:
			square();
			break;
		case 0:
		        return 0;
		default:
			cout<<"please choose correct option!"<<endl;
	}

        main();
	return 0;
}
