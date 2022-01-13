#include<graphics.h>
int main(){
	int x1=50, y1=50, x2=50, y2=150, tx=50, ty=50;
	int gd=DETECT,gm;
	initgraph(&gd, &gm, "");
	cleardevice();
	line(x1,y1, x2, y2);
	line(x1+tx, y1+ty, x2+tx, y2+ty);
	getch();
	closegraph();
}

