#include<graphics.h>
#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main(){
	int gd=DETECT, gm;
	initgraph(&gd, &gm, "");
	cleardevice();
	rectangle(10,10,200,100);
	getch();
	closegraph();
}
