#ifndef CKTPLAYER_H
#define CKTPLAYER_H
#include "player.h"

class cktPlayer : public Player {
private:
    int runs;
public:
    cktPlayer();
    cktPlayer(string,int,int);
    void Accept();
    void Display();
    ~cktPlayer();
};
#endif