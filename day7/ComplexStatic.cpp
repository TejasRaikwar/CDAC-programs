#include<iostream>
using namespace std;

class Complex{
	private:
		int real;
		int img;
		static int counter;
	public:
	
		Complex():real(0),img(0)
		{
            counter++;
			cout<<"\n Complex::Complex"<<endl;
		}
		Complex(int real,int img):real(real),img(img){
			cout<<"\n Complex::Complex(int,int)"<<endl;
		}
		void Accept(){
			cout<<"\n Please Enter real and img number:->"<<endl;
			cin>>real;
			cin>>img;
		}
		void Display()const{
			cout<<"\n Complex[" << real<<"+j"<<img<<"]"<<endl;
		}
		Complex operator+ (Complex temp)
		{
			return Complex(this->real + temp.real,this->img+temp.img);
		}
        int getStaticCounter(){
            return counter;
        }
		 
};
int Complex::counter = 0;
int main(){
	Complex c1(30,60);
	Complex c2(40,50);
	
	
	Complex c3;
	c3 = c1+(c2);

	c3.Display();
	cout<<"\ncounter"<<c1.getStaticCounter()<<endl;
	return 0;
}

