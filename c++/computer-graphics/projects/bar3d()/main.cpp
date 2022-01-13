#include<graphics.h>
#include<conio.h>
main()
{
	int gd = DETECT, gm;
	initgraph(&gd, &gm, "");

	cleardevice();
	bar3d(100,50,120,200,10,1);
	getch();
	closegraph();
}





