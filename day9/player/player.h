#ifndef PLAYER_H
#define PLAYER_H
#include<iostream>
#include<string>

using namespace std;

class Player {
private: 
    string name;
    int age;
public:
    Player();
    Player(string, int);
    void Accept();
    void Display();
    ~Player();
};
#endif