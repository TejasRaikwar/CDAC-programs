#include <iostream>
#include <string>
#include <algorithm> 
using namespace std;

class Student
{
    private:

    int rollNo;
    char name[50];
    int age;
    char phoneNumber[12];

    public:

    void enterDetails();
    

    void displayDetails();
     
    int getRollNo() const;

    string getName()const;



    static bool compare(const Student &s1, const Student &s2);
     
};
 