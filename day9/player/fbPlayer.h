#ifndef FBPLAYER_H
#define FBPLAYER_H
#include<iostream>
#include "player.h"
using namespace std;
class fbPlayer:public Player
{
    private:
        int goals;
    public:
        fbPlayer();
        fbPlayer(string ,int,int);
        void Accept();
        void Display();
        ~fbPlayer();
};
#endif