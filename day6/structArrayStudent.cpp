#include <bits/stdc++.h>
using namespace std;

struct Student
{
    int rollNo;
    char name[50];
    int age;
    char phoneNumber[12];
};

void enterDetails(Student *sp, int n)
{
    for (int i = 0; i < n; i++)
    {
	
        cout << "\nEnter details for student " << i + 1 << ":" << endl;
	cout<<"enter student rollNo:->"<<endl;
	cin>>sp[i].rollNo;
        cout << "Enter Name: ";
        cin >> sp[i].name;
        cout << "Enter Age: ";
        cin >> sp[i].age;
        cout << "Enter Mobile Number: ";
        cin >> sp[i].phoneNumber;
    }
}

void displayDetails(const Student *sp, int n)
{
    cout << "\nDetails of Students:" << endl;
    for (int i = 0; i < n; i++)
    {
        cout << "Student " << i + 1 <<" - RollNo:"<<sp[i].rollNo<< " - Name: " << sp[i].name << "\tAge: " << sp[i].age << "\tMobile: " << sp[i].phoneNumber << endl;
    }
}

bool compare(const Student &s1,const Student &s2){
       if (s1.rollNo != s2.rollNo)
		return s1.rollNo < s2.rollNo ;
 	return s1.name < s2.name;
}


int main()
{
    int n;
    cout << "Enter the number of students: ";
    cin >> n;

    Student *students = new Student[n];

    enterDetails(students, n);
    sort(students, students+n,compare);
   
    displayDetails(students, n);

    delete[] students;
    return 0;
}

