#include<iostream>
#include<string>
#include "player.h"
using namespace std;

Player::Player() : name(""), age(0) {}

Player::Player(string name, int age) : name(name), age(age) {}

void Player::Accept() {
    cout << "Enter player name:->";
    cin >> name;
    cout << "Enter player age:->";
    cin >> age;
}

void Player::Display() {
    cout << "\n[ " << "Player name: " << name << " " << "Player age: " << age << " ]\n" << endl;
}

Player::~Player(){
    cout<<"Player::~Player"<<endl;
}