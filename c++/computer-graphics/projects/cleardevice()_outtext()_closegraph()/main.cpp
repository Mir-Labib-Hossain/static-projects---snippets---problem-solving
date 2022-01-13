#include<graphics.h>
#include<conio.h>
main()
{
int  m;
	int gd = DETECT, gm;
	initgraph(&gd, &gm, "");
	cleardevice();
	outtext("electronic clinic");
	getch();
	closegraph();
}



