#include<graphics.h>
#include<bits/stdc++.h>
using namespace std;
int main()
{
 int gd=DETECT,gm;
 initgraph(&gd,&gm,"");
 int xx=getmaxx()/2;
 int yy=getmaxy()/2;
 for(int i=0; i<=2*xx; i++)
 	putpixel(i,yy,YELLOW);
 for(int i=0; i<=2*yy; i++)
 	putpixel(xx,i,YELLOW);
 int r;
 cin>>r;
 int x=0,y=r,d=3-2*r;
 for(; x<=y; x++)
 {
	 putpixel(xx+x,yy-y,CYAN);
	 putpixel(xx-x,yy-y,CYAN);
	 putpixel(xx+x,yy+y,CYAN);
	 putpixel(xx-x,yy+y,CYAN);
	 putpixel(xx+y,yy-x,CYAN);
	 putpixel(xx-y,yy-x,CYAN);
	 putpixel(xx+y,yy+x,CYAN);
	 putpixel(xx-y,yy+x,CYAN);
	 if(d<0)
	 	d=d+4*x+6;
	 else
	 {
		 y--;
		 d=d+4*(x-y)+10;
	 }
 }
 getch();
 closegraph();
 return 0;
}
