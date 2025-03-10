#include <bits/stdc++.h>
#include "Student.h"

using namespace std;
 
int main()
{
    int n;
    cout << "Enter the number of students: ";
    cin >> n;

    Student *students = new Student[n];
    for(int i=0 ; i<n;i++){
        students[i].enterDetails();
    }
   
    sort(students, students + n, Student::compare);

     
    for(int i=0; i<n; i++){
        students[i].displayDetails();
    }

    delete[] students;
    return 0;
}
