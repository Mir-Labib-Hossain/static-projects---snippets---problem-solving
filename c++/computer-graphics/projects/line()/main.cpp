#include <graphics.h>
int main()
{
    int gd = DETECT, gm;
    initgraph(&gd, &gm, "");
    line(40, 150, 250, 150);
    line(70, 200, 250, 200);
    line(100, 250, 250, 250);
    getch();
    closegraph();
}




