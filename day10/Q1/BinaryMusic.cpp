#include<iostream>
#include<fstream>
#include<cstdlib>
using namespace std;

int main() {\
    string sourceFile = "source.mp3";
    string destinationFile = "dest.mp3";
    
    ifstream fin(sourceFile, ios::binary);
    ofstream fout(destinationFile, ios::binary);

    if(!fin){
        cout << "File not found !"<< endl;
        return 1;
    }
    if(!fout){
        cout<< "file not found !";
        return 1;
    }

    fout << fin.rdbuf();
    cout<< "File copied successfully";
 
    system(("xdg-open " + destinationFile).c_str());

    return 0;
}
