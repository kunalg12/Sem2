#include<stdio.h>

struct SparseMatrix
{
  int row;
  int col;
  int value;
};

void inputMatrix(struct SparseMatrix sparse[10],int m,int n)
{
  int i,j,val=0,k=0;
  printf("enter the matrix elements (row*col=%d elements):\n",m*n);
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
	scanf("%d",val);
	if(val!=0)
	{
	  sparse[k].row=i;
          sparse[k].col=j;
          sparse[k].value=val;
          k++;	  
	}

    }	    
  }

}

void convertToSparse(int mat[10][10],int m,int n,struct SparseMatrix sparse[10])
{ 
    int k=0,i,j;
   for(i=0;i<m;i++)
   {
     for(j=0;j<n;j++)
     {
	if(mat[i][j]!=0)
	{
	  sparse[k].row=i;
          sparse[k].col=j;
         sparse[k].value=mat[i][j];
         k++;	  
	}
     }
   }	   
}

void displaySparseMatrix(struct SparseMatrix sparse[10],int nonZeroCount)
{
  int i;
  printf("Row | Column | Value\n");
  printf("----------------------\n");
  for(i=0;i<nonZeroCount;i++){
  printf("%3d | %6d | %5d\n",sparse[i].row,sparse[i].col,sparse[i].value);
  }	  

}
int main()
{
	int mat[10][10],m,n,i,j;
	struct SparseMatrix sparse[10];
	int nonZeroCount=0;

	printf("How many rows & columns :");
       scanf("%d %d",&m,&n);

       inputMatrix(sparse,m,n); // input matrix

      // convertToSparse(mat,m,n,sparse); // convert matrix to sparse

       for(i=0;i<m;i++)
       {
	 for(j=0;j<n;j++)
	 {
          if(mat[i][j]!=0)
		nonZeroCount++;  
	 }
       }
        
       displaySparseMatrix(sparse,nonZeroCount);
           
	return 0;
}
