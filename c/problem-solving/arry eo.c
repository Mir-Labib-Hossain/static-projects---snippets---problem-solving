 #include<stdio.h>
int main()
{
int i;
char a[100];
printf("Enter your password : ");
for(i=0; i<3; i++)
{
gets(a);
if(strcmp(a[i],"Tristan"==0))
{
printf("Log-on successfully");
break;
}
if(i==2)
{
printf("Access Denied");
}
}
}
