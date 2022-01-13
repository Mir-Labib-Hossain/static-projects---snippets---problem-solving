#include<graphics.h>
#include<bits/stdc++.h>
using namespace std;
int main()
{
 int x,y,x1,y1,x2,y2,dx,dy,dT,dS,d;
 int gd=DETECT, gm;
 initgraph(&gd,&gm,"");
 int xx=getmaxx()/2;
 int yy=getmaxy()/2;
 for(int i=1;i<=2*xx;i++)
 {
 	putpixel(i,yy,YELLOW);
 }
 for(int i=1;i<=2*yy;i++)
 {
 	putpixel(xx,i,YELLOW);
 }
 
 printf("\nPlease Enter The First Point Coordinate=");
 scanf("%d%d",&x1,&y1);
 printf("\nPlease Enter The Second Point Coordinate=");
 scanf("%d%d",&x2,&y2);
 x=x1;
 y=y1;
 dx=abs(x2-x1);
 dy=abs(y2-y1);
 putpixel(x+xx,yy-y,RED);
 dT=2*(dy-dx);
 dS=2*dy;
 d=2*dy-dx;
 while(x<x2)
 {
	 x++;
	 if(d<0)
	 	d=d+dS;
	 else
	 {
		 y++;
		 d=d+dT;
	 }
	 putpixel(x+xx,yy-y,RED);
 }
 getch();
 closegraph();
 return 0;
}
