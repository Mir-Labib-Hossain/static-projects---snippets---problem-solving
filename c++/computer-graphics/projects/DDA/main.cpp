#include<graphics.h>
#include<bits/stdc++.h>
#include<iostream>
using namespace std;
int main(){
	int x1, y1, x2, y2, x, y, xi, yi, dx, dy, s, i;
	int gd=DETECT,gm;
	initgraph(&gd, &gm, "");
	cleardevice();
	// x1=100, y1=100, x2=200,y2=200;
	cin >> x1 >> y1 >> x2 >> y2;
	x=x1;
	y=y1;
	dx=abs(x2-x1);
	dy=abs(y2-y1);
	s=max(dx,dy);
	xi=(round)((double)dx/(double)s);
	yi=(round)((double)dy/(double)s);
	putpixel(x,y,YELLOW);
	for(i=0; i<s; i++){
		x=x+xi;
		y=y+yi;
		putpixel(x,y,YELLOW);	
		delay(10);
	}
	getch();
	closegraph();
}
