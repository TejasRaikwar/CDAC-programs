#include<iostream>
#include "cktPlayer.h"
#include "fbPlayer.h"
using namespace std;

int main() {
    // Player p;
    // p.Display();
    
    cktPlayer c("Sachin", 45, 100);
    //c.Accept();
    c.Display();

    fbPlayer f("shanthi",56,50);
    f.Display();

    return 0;
}