#include<stdio.h>

int FactDiff(int iNo)
{
    int i = 0;
    int iFactSum = 0;
    int iNonFactSum = 0;

    for(i = 1; i < iNo; i++)
    {
        if(iNo % i == 0)
        {
            iFactSum += i;
        }
        else
        {
            iNonFactSum += i;
        }
    }
    return iFactSum - iNonFactSum;
 }
 
int main()
{
   int iValue = 0;
   int iRet = 0;

   printf("Enter number :\n");
   scanf("%d",&iValue);

   iRet = FactDiff(iValue);

   printf("%d",iRet);

    return 0;
}