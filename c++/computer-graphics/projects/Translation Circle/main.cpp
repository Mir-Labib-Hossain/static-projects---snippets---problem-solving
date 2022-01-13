#include <graphics.h>
#include <iostream>
using namespace std;
int main(){
	int gd = DETECT, gm;
	initgraph(&gd, &gm, "");
	int x=120, y=120, r= 100;
	int tx, ty;
	//250 0
	cin >> tx >> ty;
	cleardevice();
	circle(x,y,r);
	circle(x+tx, y+ty, r);
	getch();
	closegraph();
	return 0;
}
