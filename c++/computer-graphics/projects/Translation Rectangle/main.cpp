#include <graphics.h>>
#include <iostream>
using namespace std;
int main(){
	int gd=DETECT,gm;
	initgraph(&gd, &gm, "");
	int x1=123,y1=40, x2=40,y2=145,x3=200,y3=145;
	int tx, ty;
	//200 0
	cin >> tx >> ty;
	outtext("Before translation :");
	line(x1, y1, x2, y2);
	line(x2, y2, x3, y3);
	line(x3, y3, x1, y1);
	outtext("After translation :");
	line(x1+tx, y1+ty, x2+tx, y2+ty);
	line(x2+tx, y2+ty, x3+tx, y3+ty);
	line(x3+tx, y3+ty, x1+tx, y1+ty);
	getch();
	closegraph();
	return 0;
}

