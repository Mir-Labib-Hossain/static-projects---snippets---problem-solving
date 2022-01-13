#include <graphics.h>>
int main(){
	int gd=DETECT,gm;
	initgraph(&gd, &gm, "");
	int x1=123,y1=40;
	int x2=40,y2=145;
	int x3=200,y3=145;
	
	line(x1, y1,x2,y2);
	line(x2, y2, x3, y3);
	line(x1, y1,x3,y3);
	getch();
	closegraph();
	return 0;
}

