#include<stdio.h>

void CheckNumberType(int num)
{
    if(num > 0)
    {
        printf("%d is a positive number. \n",num);
    }
    else if(num < 0)
    {
        printf("%d is a Negative number. \n", num);
    }
    else
    {
        printf("The number is zero.\n");
    }
}
int main()
{
    int number;
    printf("Enter number :\n");
    scanf("%d",&number);

    CheckNumberType(number);

    return 0;
}