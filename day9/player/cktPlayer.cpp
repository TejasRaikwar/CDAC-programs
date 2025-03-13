#include<iostream>
#include"cktPlayer.h"

using namespace std;

    cktPlayer::cktPlayer():runs(0)
    {

    }
    cktPlayer::cktPlayer(string name ,int age,int runs):Player::Player(name,age),runs(runs)
    {

    }

    void cktPlayer::Accept(){
        Player::Accept();
        cout<<"please enter player runs:->";
        cin>>runs;
    }
    void cktPlayer::Display(){
        Player::Display();
        cout<<"Player runs:->"<<runs<<endl;
    }
    cktPlayer::~cktPlayer(){
        cout<<"cktPlayer::~cktPlayer"<<endl;
    }

