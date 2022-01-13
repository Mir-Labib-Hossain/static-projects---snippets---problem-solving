#include<graphics.h>
#include<conio.h>
main()
{
	int gd = DETECT, gm;
	initgraph(&gd, &gm, "");
	cleardevice();
	bar(100,50,130,200);
	getch();
	closegraph();
}




