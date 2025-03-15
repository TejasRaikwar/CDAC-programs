#include<iostream>
#include<string>
#include<fstream>
#include"MobilePhone.cpp"
using namespace std;

const int MAX_MOBILES = 100;
void WriteData(MobilePhone &m){
          
	ofstream fout("mobile.dat");
        
        fout<<"Serial No:"<<m.serialNo<<", Model No:"<<m.modelNo<<", Brand: " << m.brandName <<", Price: " << m.price << endl;

        fout.close();

}
/*void WriteData(MobilePhone m){
          
	ofstream fout("mobile.dat");

	char ch='y';

	while(ch!='n'){
		
		m.Accept();
		
		fout<<(char*)m;

		cout<<"Do you want to Enter continue??\n y for continue\n n to close  : ";
		cin>>ch;
	
	
	}

        fout.close();

}*/
void ReadFile(){
        ifstream fin("mobile.dat");
	
	if(!fin){
	  cout<<"File Cannot found";
	}
	
	while(fin){
	string str;
	getline(fin,str);
	cout<<str;
	}
	cout<<endl;
	fin.close();

}
void addMobilePhoneToFile() {
    MobilePhone phone;
    phone.Accept();
    WriteData(phone);  // Using the global WriteData function
    cout << "MobilePhone added successfully!" << endl;
}

// Function to read MobilePhones from file and store them in an array
int readAllMobilePhonesFromFile(MobilePhone phones[], int maxSize) {
    ifstream inFile("mobile.dat");
    if (!inFile) {
        cout << "Error opening file or file does not exist!" << endl;
        return 0;
    }

    ReadFile();  // Using the existing global ReadFile function
    inFile.close();
    return 1;
}
void displaySortedByPrice() {
    MobilePhone phones[MAX_MOBILES];
    int count = readAllMobilePhonesFromFile(phones, MAX_MOBILES);

    if (count == 0) {
        cout << "No mobile phones found in file." << endl;
        return;
    }

    // Sorting by price using Bubble Sort
    for (int i = 0; i < count - 1; i++) {
        for (int j = 0; j < count - i - 1; j++) {
            if (phones[j].price > phones[j + 1].price) {
                swap(phones[j], phones[j + 1]);
            }
        }
    }

    cout << "\nMobilePhones sorted by price:\n";
    for (int i = 0; i < count; i++) {
        phones[i].Display();
    }
}

int main() {
    int choice;
    do {
        cout << "\nMENU:\n";
        cout << "1. Add MobilePhone to file\n";
        cout << "2. Read all MobilePhones from file\n";
        cout << "3. Read & display MobilePhones sorted by price\n";
        cout << "4. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1:
                addMobilePhoneToFile();
                break;
            case 2: {
                MobilePhone phones[MAX_MOBILES];
                int count = readAllMobilePhonesFromFile(phones, MAX_MOBILES);
                cout << "\nAll MobilePhones:\n";
                for (int i = 0; i < count; i++) {
                    phones[i].Display();
                }
                break;
            }
            case 3:
                displaySortedByPrice();
                break;
            case 4:
                cout << "Exiting program..." << endl;
                break;
            default:
                cout << "Invalid choice! Try again." << endl;
        }
    } while (choice != 4);

    return 0;
}


