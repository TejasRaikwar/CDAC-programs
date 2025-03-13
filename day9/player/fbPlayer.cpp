#include"fbPlayer.h"

#include<iostream>
using namespace std;

        fbPlayer::fbPlayer():goals(0)
        {

        }
        fbPlayer::fbPlayer(string name ,int age,int goals):Player(name,age),goals(goals)
        {

        }
        void fbPlayer::Accept(){
            Player::Accept();
            cout<<"Enter fbPlayer goals:"<<endl;
            cin>>goals;
        };
        void fbPlayer::Display(){
            Player::Display();
            cout<<"fbPlayer goals: "<<goals<<endl;
        }
        fbPlayer::~fbPlayer(){
            cout<<"fbPlayer::~fbPlayer"<<endl;
        }