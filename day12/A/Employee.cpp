#include <iostream>
#include "Address.cpp"
#include <vector>
#include <algorithm>

using namespace std;

class Employee
{
    int eid;
    Address address;
    string name;
    double salary;

public:
    Employee() {};
    Employee(int eid, string name, double salary, Address addr) : eid(eid), name(name) {};
    void DisplayEmployee() const
    {
        cout << "Employee id : " << eid << ", Name : " << name << ", Salary : " << salary << endl
             << "Address : ";
        address.Display();
    }
    // use less
    int getEid() const
    {
        return eid;
    }

    // Getters
    string getName() const { return name; }
    void getAddress() const { address.Display(); }
    double getSalary() const { return salary; }

    // Setters
    void setName(string name)
    {
        this->name = name;
    };
    void setSalary(double salary)
    {
        this->salary = salary;
    }
    void setAddress(const Address addr)
    {
        address = addr;
    }

    // end of useless

    void setData()
    {
        cout << "Enter employee id : ";
        cin >> eid;
        cout << "Enter name : ";
        getline(cin, name);
        address.Accept();
        cout << "Enter salary : ";
        cin >> salary;
    }
};

void addRecord(vector<Employee> &emps)
{
    Employee emp;
    emp.setData();
    emps.push_back(emp);
    cout << "record saved successfully.\n";
}

void displayAll(const vector<Employee> &emps)
{
    if (emps.empty())
    {
        cout << "no record found. \n";
        return;
    }

    for (const auto &emp : emps)
    {
        emp.DisplayEmployee();
    }
}

void searchRecord(const vector<Employee> &emps)
{
    int empid;
    cout << "Enter Emp id to search :";
    cin >> empid;

    auto it = find_if(emps.begin(), emps.end(), [empid](const Employee &emp)
                      { return emp.getEid() == empid; });
    if(it != emps.end()){
        cout<< "Record found:\n";
        it->DisplayEmployee();
    }else{
        cout<< "Record not found!\n";
    }
}

void deleteRecord(vector<Employee> &emps){
    int empid;
    cout<<"Enter Employee Id to delete" ;
}

int main()
{

    return 0;
}