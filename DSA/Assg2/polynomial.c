#include<stdio.h>

struct Term{
    int coefficient;
    int exponent;
};

void addPolynomials(struct Term poly1[],int size1,struct Term poly2[],int size2,struct Term result[])
{
    int i=0,j=0,k=0;

    while(i<size1 && j<size2)
    {
        if(poly1[i].exponent > poly2[j].exponent)
        {
            result[k++] = poly1[i++];
        }
        else if(poly1[i].exponent<poly2[j].exponent)
        {
            result[k++]=poly2[j++];
        }
        else{

            result[k].exponent=poly1[i].exponent;
            result[k++].coefficient=poly1[i++].coefficient+poly2[j++].coefficient;
        }
    }

    while(i<size1)
    {
        result[k++]=poly1[i++];
    }

    while(j<size2)
    {
        result[k++]=poly2[j++];
    }
}
// Function to multiply two polynimials
int multiplyPoly(struct Term poly1[], int size1, struct Term poly2[], int size2, struct Term result[])
{
    struct Term temp[MAX];
    int tempCount = 0;

    for (int i = 0; i < size1; i++)
    {
        for (int j = 0; j < size2; j++)
        {
            int expo = poly1[i].pow + poly2[j].pow;
            int coef = poly1[i].coef * poly2[j].coef;

            int flag = 0;
            for (int k = 0; k < tempCount; k++)
            {
                if (temp[k].pow == expo)
                {
                    temp[k].coef += coef;
                    flag = 1;
                    break;
                }
            }

            if (flag == 0)
            {
                temp[tempCount].pow = expo;
                temp[tempCount].coef = coef;
                tempCount++;
            }
        }
    }

    int k = 0;
    for (int i = 0; i < tempCount; i++)
    {
        if (temp[i].coef != 0)
        {
            result[k++] = temp[i];
        }
    }

    return k;
}

void displayPolynomials(struct Term poly[],int size)
{
    int i;

    for(i=0;i<size;i++)
    {
        printf("%dx^%d",poly[i].coefficient,poly[i].exponent);
        if(poly[i].exponent==0)
        {
            break;
        }
        if(i<size-1)
        {
            printf(" + ");
        }
    }
}
int main()
{
  struct Term poly1[]={{3,4},{2,3},{5,1},{7,0}};
  int size1=sizeof(poly1) / sizeof(poly1[0]);

  struct Term poly2[]={{1,3},{3,2},{2,1},{1,0}};
  int size2=sizeof(poly2) / sizeof(poly2[0]);

  struct Term result[size1+size2]; // maximum possible size

  addPolynomials(poly1,size1,poly2,size2,result);
   
   printf("Polynomial 1: ");
   displayPolynomials(poly1,size1);
   
   printf("Polynomial 2: ");
   displayPolynomials(poly2,size2);
   
   printf("Resultant Polynomial : ");
   displayPolynomials(result,size1+size2);

    return 0;
}