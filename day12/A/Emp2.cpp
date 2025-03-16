#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
using namespace std;

// Employee class
class Employee {
private:
    int eid;
    string name;
    string address;
    double salary;

public:
    // Parameterized constructor
    Employee(int id, string n, string addr, double sal)
        : eid(id), name(n), address(addr), salary(sal) {}

    // Display employee details
    void display() const {
        cout << "Employee ID: " << eid << ", Name: " << name
             << ", Address: " << address << ", Salary: " << salary << endl;
    }

    // Getters for searching and modifying
    int getEid() const { return eid; }
    string getName() const { return name; }
    string getAddress() const { return address; }
    double getSalary() const { return salary; }

    // Setters for modifying
    void setName(string n) { name = n; }
    void setAddress(string addr) { address = addr; }
    void setSalary(double sal) { salary = sal; }
};

// Function to add a record
void addRecord(vector<Employee>& employees) {
    int eid;
    string name, address;
    double salary;

    cout << "Enter Employee ID: ";
    cin >> eid;
    cin.ignore(); // Clear input buffer
    cout << "Enter Name: ";
    getline(cin, name);
    cout << "Enter Address: ";
    getline(cin, address);
    cout << "Enter Salary: ";
    cin >> salary;

    employees.push_back(Employee(eid, name, address, salary));
    cout << "Record added successfully!" << endl;
}

// Function to display all records
void displayAll(const vector<Employee>& employees) {
    if (employees.empty()) {
        cout << "No records found!" << endl;
        return;
    }

    for (const auto& emp : employees) {
        emp.display();
    }
}

// Function to search for a record by Employee ID
void searchRecord(const vector<Employee>& employees) {
    int eid;
    cout << "Enter Employee ID to search: ";
    cin >> eid;

    auto it = find_if(employees.begin(), employees.end(),
                     [eid](const Employee& emp) { return emp.getEid() == eid; });

    if (it != employees.end()) {
        cout << "Record found:" << endl;
        it->display();
    } else {
        cout << "Record not found!" << endl;
    }
}

// Function to delete a record by Employee ID
void deleteRecord(vector<Employee>& employees) {
    int eid;
    cout << "Enter Employee ID to delete: ";
    cin >> eid;

    auto it = find_if(employees.begin(), employees.end(),
                      [eid](const Employee& emp) { return emp.getEid() == eid; });

    if (it != employees.end()) {
        employees.erase(it);
        cout << "Record deleted successfully!" << endl;
    } else {
        cout << "Record not found!" << endl;
    }
}

// Function to modify a record by Employee ID
void modifyRecord(vector<Employee>& employees) {
    int eid;
    cout << "Enter Employee ID to modify: ";
    cin >> eid;

    auto it = find_if(employees.begin(), employees.end(),
                      [eid](const Employee& emp) { return emp.getEid() == eid; });

    if (it != employees.end()) {
        string name, address;
        double salary;

        cin.ignore(); // Clear input buffer
        cout << "Enter new Name: ";
        getline(cin, name);
        cout << "Enter new Address: ";
        getline(cin, address);
        cout << "Enter new Salary: ";
        cin >> salary;

        it->setName(name);
        it->setAddress(address);
        it->setSalary(salary);

        cout << "Record modified successfully!" << endl;
    } else {
        cout << "Record not found!" << endl;
    }
}

int main() {
    vector<Employee> employees;
    int choice;

    do {
        cout << "\nMenu:\n";
        cout << "1. Add Record\n";
        cout << "2. Display All Records\n";
        cout << "3. Search Record\n";
        cout << "4. Delete Record\n";
        cout << "5. Modify Record\n";
        cout << "6. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1:
                addRecord(employees);
                break;
            case 2:
                displayAll(employees);
                break;
            case 3:
                searchRecord(employees);
                break;
            case 4:
                deleteRecord(employees);
                break;
            case 5:
                modifyRecord(employees);
                break;
            case 6:
                cout << "Exiting program..." << endl;
                break;
            default:
                cout << "Invalid choice! Please try again." << endl;
        }
    } while (choice != 6);

    return 0;
}