#include<bits/stdc++.h>
using namespace std;
class employee{
	private:
		string empNo;
		string name;
		double salary;
		string dept;
	public:
	void Accept(){
		cout<<"please enter empNo:->";
		cin>>empNo;
		cout<<"please enter employee name:->";
		cin>>name;
		cout<<"please enter epmployee salary:->";
		cin>>salary;
		cout<<"please emter epmloyee dept:->";
		cin>>dept;

	}
	void Display(){
		cout<<"employee empNo:->"<<empNo<<endl;
		cout<<"employee name:->"<<name<<endl;
		cout<<"employee salary:->"<<salary<<endl;
		cout<<"employee dept:->"<<dept<<endl;
	}
	static bool compare(const employee &e1,const employee &e2)
	{	if(e1.empNo != e2.empNo){
		    return e1.empNo < e2.empNo;
		}else if(e1.name != e2.name){
			return e1.name<e2.name;
		}
		return e1.salary < e2.salary;
	}
};

int main(){
	int n;
	cout<<"enter number of employee:->"<<endl;
	cin>>n;
	
	employee *e = new employee[n];
	
	for(int i=0;i<n;i++){
		cout<<"enter details:->"<<endl;
		e[i].Accept();
	}
	sort(e,e+n,employee::compare);
	for(int i=0;i<n;i++){
		cout<<"details:->"<<endl;
		e[i].Display();
	}
		
	return 0;
}
