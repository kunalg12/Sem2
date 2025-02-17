#include<stdio.h>
#include<stdlib.h>
int main()
{       // Array
        int arr[5]={1,2};

        // Dynamic arr
        int *dyarr1=(int*)malloc(5*sizeof(int));
        int *dyarr2=(int*)calloc(5,sizeof(int));

        for(int i=0;i<5;i++)
        {
        //  printf("%d",dyarr1[i]);
        }

        // Strings

        //char gretting[]="Hello World";
       // printf("%s",gretting);

        // Arr of pointer
          int *ptrArr[5];
          int b[3]={1,2,3};
          
          for(int i=0;i<3;i++)
          {
                ptrArr[i]=&b[i];
                 printf("%p\n",ptrArr[i]);
          
          }
         // Arr og struct

         struct point{
            int x;
            int y;
         };  
           struct Point points[3]; 
         for(int i=0;i<3;i++)
         {
            printf("Enter the values:\n");
            scanf("%d/n%d",&points[i].x,&points[i].y);
         }
         for(int i=0;i<3;i++)
         {
            printf("x: %d y: %d",points[i].x,points[i].y);
         }
        


        return 0;

}
