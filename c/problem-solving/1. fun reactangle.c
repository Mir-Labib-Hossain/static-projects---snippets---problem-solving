float areaOfRec(float Height,float width)
{
    return (Height*width);
}
int main()
{
    float a,b;
    printf("Enter height :");
    scanf("%f",&a);
    printf("Enter width :");
    scanf("%f",&b);
    printf("Area of Rectangle : %.2f",areaOfRec(a,b));
}
