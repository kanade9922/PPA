#include<stdio.h>

// Function should return int (1 for even, 0 for odd)
int CheckEvenOdd(int num)
{
    if(num % 2 == 0)
    {
        return 1; // Even
    }
    else
    {
        return 0; // Odd
    }
}

int main()
{
    int number;
    int result;

    printf("Enter number :\n");
    scanf("%d", &number);

    result = CheckEvenOdd(number);

    if(result == 1)
    {
        printf("It is even Number\n");
    }
    else
    {
        printf("It is odd Number\n");
    }

    return 0;
}