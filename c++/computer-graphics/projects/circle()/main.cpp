#include<graphics.h>
#include<conio.h>
main()
{
	int m,r,c;
	int gd = DETECT, gm;
	initgraph(&gd, &gm, "");
	cleardevice();
	for(c=1; c<= 15; c++)
	{
		setcolor(c);
		circle(300,200,c*10);
	}
	getch();
	closegraph();
	return 0;
}








